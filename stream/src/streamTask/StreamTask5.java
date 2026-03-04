package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTask5 {
	public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
//		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		int sum = nums
//					.stream()
//					.mapToInt(x -> x)
//					.sum();
//		System.out.println(sum);
		
		Member member1 = new Member(1L, "홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member(2L, "이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member(3L, "장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member(4L, "김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member(5L, "김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member(6L, "흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1, member2, member3, member4, member5, member6));
		
//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 이름과 취미를
//      아래와 같이 출력한다
//      이름: 홍길동
//      취미: 스포츠댄스, 개발
		
//      필드 : 이름, 취미, 소개
//      홍길동, 축구_농구_야구, 나는 축구왕!
//      이순신, 개발_당구_축구, 나는 개발자 좋아!
//      장보고, 피아노, 피아노만 한 우물!
//      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//      김영희, 골프_야구, 운동 선수는 나의 꿈
//      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		
//		members
//			.stream()
//			.filter(x -> x.getHobby().contains("개발"))
//			.forEach(x -> {
//				System.out.printf("이름: %s\n", x.getName());
//				System.out.printf("취미: %s\n", x.getHobby().stream().collect(Collectors.joining(", ")));
//			});
		
//      3) 취미를 3개 이상 가진 사람의 id를 출력
		
//		members
//			.stream()
//			.filter(x -> x.getHobby().size() >= 3)
//			.map(x -> x.getId())
//			.forEach(System.out::println);
		
//      4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds에 담기
		
		ArrayList<Long> hobbyIds = members
			.stream()
			.filter(x -> x.getHobby().size() >= 3)
			.map(x -> x.getId())
			.collect(Collectors.toCollection(() -> new ArrayList<Long>()));	//map으로 반환하고 싶다면 .collect(Collectors.toMap(key, value));

		System.out.println(hobbyIds);

//		HashMap으로 변형
//	     HashMap<Long, Long> Longs = members
//	             .stream()
//	             .filter(member -> member.getHobbies().split("_").length >= 3)
//	             .map(member -> member.getId())
//	             .collect(Collectors.toMap(
//	                   id -> id, 
//	                   id -> id,
//	                   (a, b) -> a,
//	                   () -> new HashMap<Long, Long>()));
		
//      5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개 출력하기
		
//		members
//			.stream()
//			.filter(x -> hobbyIds.contains(x.getId()))
//			.forEach(x -> System.out.println(x.getIntroduce()));
		
		
//      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//      출력 예시)
//         이름: 흰둥이
//         취미: 개발_축구_농구
//         소개: 개발도 운동도 다 잘해요!
		
		int biggestLength = members
			.stream()
			.mapToInt(x -> x.getIntroduce().length())
			.max()
			.getAsInt();
		
		members
			.stream()
			.filter(x -> x.getIntroduce().length() == biggestLength)
			.forEach(x -> {
				System.out.printf("이름: %s\n", x.getName());
				System.out.printf("취미: %s\n", x.getHobby().stream().collect(Collectors.joining("_")));
				System.out.printf("소개: %s\n", x.getIntroduce());				
			});
		
//		강사님 코드
//		Optional<Member> member = members
//        .stream()
//        .max(Comparator.comparingInt(m -> m.getIntroduce().length()));
//     
//		member.ifPresent((m) -> {
//			System.out.println(m);
//		});
//		
//     System.out.println(member);
	}
}
