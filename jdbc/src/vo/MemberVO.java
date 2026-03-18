package vo;

import java.util.Objects;

public class MemberVO {
//  1. private
	private long memberId;
	private String memberEmail;
	private String memberPassword;
	private String memberAddress;
	private String memberRecommenderEmail;
	
//  2. 기본 생성자
	public MemberVO() {;}
	
//  3. 초기화 생성자
	public MemberVO(String memberEmail, String memberPassword, String memberAddress) {
		this.memberPassword = memberPassword;
		this.memberAddress = memberAddress;
		this.memberRecommenderEmail = memberRecommenderEmail;
	}
	
	public MemberVO(long memberId, String memberEmail, String memberPassword, String memberAddress,
			String memberRecommenderEmail) {
		super();
		this.memberId = memberId;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAddress = memberAddress;
		this.memberRecommenderEmail = memberRecommenderEmail;
	}
	
//	4. getter, setter
	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberRecommenderEmail() {
		return memberRecommenderEmail;
	}

	public void setMemberRecommenderEmail(String memberRecommenderEmail) {
		this.memberRecommenderEmail = memberRecommenderEmail;
	}

//	5. toString, hashCode, equals 재정의
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberAddress=" + memberAddress + ", memberRecommenderEmail=" + memberRecommenderEmail + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return memberId == other.memberId;
	}
}
