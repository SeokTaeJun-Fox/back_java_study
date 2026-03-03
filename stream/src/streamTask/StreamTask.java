package streamTask;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTask {
	
	   public String addNamePrefix(String name) {
		      return "이름 :" + name;
		   }
	   
	   public boolean filterUser30s(User user) {
		      return user.getAge() >= 30 && user.getAge() <= 39;
		   }
		   
		   public String reverseString(String str) {
		      return new StringBuilder(str).reverse().toString();
		   }
	
	public static void main(String[] args) {
		User user1 = new User(1L, "홍길동", 20, "개발자", "남");
		User user2 = new User(2L, "장보고", 30, "기획자", "남");
		User user3 = new User(3L, "이순신", 35, "사장", "남");
		User user4 = new User(4L, "김영희", 25, "간호사", "여");
		User user5 = new User(5L, "김철수", 35, "소방관", "남");
		User user6 = new User(6L, "김영숙", 22, "유튜버", "여");
		
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6));
//		이름만 출력
//		이름: 홍길동
//	    StreamTask st = new StreamTask();
//	    users.stream().map(User::getName).map(st::addNamePrefix).forEach(System.out::println);
		
//		.filter(): 조건식을 만족하는 값을 반환해서 Stream으로 리턴
//		users
//			.stream()
//			.filter((user) -> user.getAge() >= 20 && user.getAge() <= 29)
//			.forEach(System.out::println);
		
//		"김"씨 성을 가진 유저만 출력
//		MyFind myFind = (user) -> user.getName().startsWith("김");
//		
//		users
//			.stream()
//			.filter(myFind::isStartWithKim)
//			.forEach(System.out::println);
		
//		30대 유저의 직업만 거꾸로 뒤집어 출력
//		"자획기"
//		"관방소"
//		CheckThirty checkThirty = (user) -> user.getAge() >= 30 && user.getAge() < 40;
//		PrintReverse reverse = (input) -> {
//			String newString = "";
//			int length = input.length();
//			for(int i = 0; i < length; i++) {
//				newString += input.charAt(length - i - 1);
//			}
//			
//			System.out.println(newString);
//		};
//		
//		users
//			.stream()
//			.filter(checkThirty::check)
//			.map(user -> user.getJob())
//			.forEach(reverse::print);
		
//		다른 풀이
	      StreamTask st = new StreamTask();
	      users
	         .stream()
	         .filter(st::filterUser30s)
	         .map(User::getJob)
	         .map(st::reverseString)
	         .forEach(System.out::println);
	}
}
