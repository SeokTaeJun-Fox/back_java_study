package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.MemberVO;

public class MemberDAO {
//  1. 연결
	Connection connection;
//	2. 쿼리
	PreparedStatement preparedStatement;
//	3. 결과
	ResultSet resultSet;
	
//	로그인 성공
	public static Long session;
	
	public void closeResources() {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			
			if(resultSet != null) {
				resultSet.close();
			}
			
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_ADDRESS)"
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
		
		try {
			//쿼리 완성!
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberAddress());
			
//			쿼리를 실행
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("member join query 오류");
			e.printStackTrace();
		} finally {
			this.closeResources();
		}
	}
	
//  로그인
  public boolean login(MemberVO memberVO) {
     connection = DBConnecter.getConnect();
     String query = "SELECT ID FROM TBL_MEMBER "
           + "WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
     boolean check = false;
     
     try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, memberVO.getMemberEmail());
        preparedStatement.setString(2, memberVO.getMemberPassword());
        
//        결과가 있을 때
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        session = resultSet.getLong(1);
        check = true;
        
     } catch (SQLException e) {
        e.printStackTrace();
     } finally {
        this.closeResources();
     }
     
     return check;
     
  }
	
//	정보수정
	public void update(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER "
				+ "SET MEMBER_EMAIL = ?, MEMBER_PASSWORD = ?, MEMBER_ADDRESS = ?"	//?자리는 알아서 띄운다
				+ "WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberAddress());
			preparedStatement.setLong(4, session);
			preparedStatement.executeUpdate();	//결과가 없을 때 : executeUpdate
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResources();
		}
	}
}
