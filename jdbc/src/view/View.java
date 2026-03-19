package view;

import java.util.ArrayList;
import java.util.Arrays;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
//		MemberVO memberVO = new MemberVO();
//		
//		memberVO.setMemberEmail("hong1234@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberAddress("서울시 강남구");
//		
//		memberDAO.join(memberVO);
		
//      3명 데이터 추가하기
//      lee1234@gmail.com, "1234", "경기도 성남시"
//      jang4567@gmail.com, "1234", "경기도 수원시"
//      kim7897@gmail.com, "1234", "서울시 종로구"
		
//		MemberVO lee = new MemberVO();
//		lee.setMemberEmail("lee1234@gmail.com");
//		lee.setMemberPassword("1234");
//		lee.setMemberAddress("경기도 성남시");
//		memberDAO.join(lee);
//		
//		MemberVO jang = new MemberVO();
//		jang.setMemberEmail("jang4567@gmail.com,");
//		jang.setMemberPassword("1234");
//		jang.setMemberAddress("경기도 수원시");
//		memberDAO.join(jang);
//		
//		MemberVO kim = new MemberVO();
//		kim.setMemberEmail("kim7897@gmail.com");
//		kim.setMemberPassword("1234");
//		kim.setMemberAddress("서울시 종로구");
//		memberDAO.join(kim);
//		
//		System.out.println("회원가입 완료!");

//		강사님 코드
//      3명 데이터 추가하기
	      MemberVO hong = new MemberVO("hong1234@gmail.com", "1234", "서울시 강남구");
	      MemberVO lee = new MemberVO("lee1234@gmail.com", "1234", "경기도 성남시");
	      MemberVO jang = new MemberVO("jang4567@gmail.com", "1234", "경기도 수원시");
	      MemberVO kim = new MemberVO("kim7897@gmail.com", "1234", "서울시 종로구");
	      
//	      ArrayList<MemberVO> users = new ArrayList<MemberVO>(Arrays.asList(hong, lee, jang, kim));
//	      users.forEach(memberDAO::join);
//			System.out.println("회원가입 완료!");

//	      memberDAO.join(jang);

	      if(memberDAO.login(kim)) {
	    	  System.out.println("로그인");
	    	  
	    	  System.out.println("로그인 회원 정보 : " + memberDAO.findById());
	    	  
//	    	  memberDAO.getRecommenders().forEach(System.out::println);
	    	  
	    	  System.out.println(memberDAO.getMyRecommender());
	    	  
//	    	  if(memberDAO.withDraw()) {
//	    		  System.out.println("탈퇴");
//	    	  } else {
//	    		  System.out.println("탈퇴 실패");
//	    	  }
	    	  
//	    	  memberDAO.changePassword("1234");
//	    	  System.out.println("비밀번호 변경");
	      } else {
			System.out.println("로그인 실패");
	      }
	      
	}
}
