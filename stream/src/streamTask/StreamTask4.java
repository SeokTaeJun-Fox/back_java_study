package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask4 {

//	   강사님 코드
//	   public static String changeToZero(int n) {
//		      return String.valueOf((char)(n + 65));
//		   }
	
	public static void main(String[] args) {
//      모두 Stream 문법으로 활용
//      1. 1~10까지 ArrayList에 담고 총 합을 출력
		
//		ArrayList<Integer> nums = new ArrayList<Integer>(IntStream.rangeClosed(1, 10).boxed().toList());
//		int sum = nums
//			.stream()
//			.mapToInt(x -> x)
//			.sum();
//		
//		System.out.println(sum);
		
//      2. ABCDEF를 각각 문자 별로 출력
//		시작 : IntStream으로 시작
		
//		IntStream
//			.rangeClosed('A', 'F')
//			.mapToObj(x -> (char)x)
//			.forEach(System.out::print);
		
//      3. ABDEF를 문자열로 출력
		
//		IntStream
//			.rangeClosed('A', 'F')
//			.filter(x -> (char)x != 'C')
//			.mapToObj(x -> (char)x)
//			.forEach(System.out::print);
		
//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
		
//		List<Integer> list = IntStream
//			.rangeClosed(1, 100)
//			.filter(x -> x % 2 == 1)
//			.boxed()
//			.toList();
//		
//		ArrayList<Integer> nums = new ArrayList<Integer>(list);
//		nums
//			.stream()
//			.forEach(System.out::println);
			
//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk, apple
		
		//1. Arraylist에 5개 저장
		//2. 모두 소문자 변경(toLowerCase)
		//3. MapToInt로 각 문자열의 a갯수를 저장
			//3-1 각 문자열을 캐릭터 intStream으로 변환
			//3-2 filter이후 count
		
//		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk", "apple"));
//		int countA = strings
//			.stream()
//			.map(String::toLowerCase)
//			.mapToInt(x -> {
//				return (int)(x
//				.chars()
//				.mapToObj(ch -> (char)ch)
//				.filter(ch -> ch == 'a')
//				.count());
//			}).sum();
//		
//		System.out.println(countA);
		
//      6. 첫 번째 문자가 대문자인 문자열만 출력
//      Apple, banana, Melon, tomato
		
//		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
//		strings
//			.stream()
//			.filter(x -> x.charAt(0) >= 'A' && x.charAt(0) <= 'Z')
//			.forEach(System.out::println);
		
//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
		
//		ArrayList<Character> stringArr = new ArrayList<Character>(Arrays.asList('공', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'));
//		String hangeul = "칠공이사팔";
//		
//		String result = hangeul
//			.chars()
//			.mapToObj(x -> (char)x)
//			.map(stringArr::indexOf)
//			.map(String::valueOf)
//			.collect(Collectors.joining());
//		
//		System.out.println(result);
		
      
//      8. 정수를 한글로 변경
//      "0123" -> "공일이삼"
		
		String intString = "70248";
		ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"));
		
		String result = intString
			.chars()
			.mapToObj(x -> Integer.parseInt("" + (char)x))
			.map(stringArr::get)
			.collect(Collectors.joining());
		
		System.out.println(result);
		
		//강사님 코드
////      모두 Stream 문법으로 활용
////      1. 1~10까지 ArrayList에 담고 총 합을 출력
////      IntStream
////         .rangeClosed(1, 10)
////         .mapToObj(Integer::valueOf)
////         .collect(Collectors.toList())
////         .forEach(System.out::println);
//      
////      2. ABCDEF를 각각 문자 별로 출력
////      String data2 = IntStream
////         .range(0, 6)
////         .mapToObj(StreamTask4::changeToZero)
////         .collect(Collectors.joining(""));
////      System.out.println(data2);
//      
////      3. ABDEF를 문자열로 출력
////      String data3 = IntStream
////         .range(0, 5)
////         .map(n -> n > 1 ? n + 1 : n)
////         .mapToObj(StreamTask4::changeToZero)
////         .collect(Collectors.joining(""));
////      
////      System.out.println(data3);
//      
////      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
////      IntStream
////         .rangeClosed(1, 50)
////         .mapToObj(n -> n * 2 - 1)
////         .collect(Collectors.toList())
////         .forEach(System.out::println);
////      
////      Integer[] arr = new Integer[50];
////      for(int i = 0; i < arr.length; i++) {
////         arr[i] = (i + 1) * 2 - 1;
////      }
////      
////      ArrayList<Integer> datas3 = new ArrayList<Integer>(Arrays.asList(arr));
////      
////      datas3.addAll(Arrays.asList(arr));
////      System.out.println(datas3);
//      
////      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
////      Black, WHITE, reD, yeLLow, PINk, apple
////      ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Blasack", "WHITE", "reD", "yeLLow", "PINk", "apple"));
////      int aCount = datas5
////         .stream()
////         .map(String::toLowerCase)
////         .filter(lowercase -> lowercase.contains("a"))
////         .map(str -> str.chars()
////               .filter(c -> c == 97)
////               .mapToObj(c -> String.valueOf((char)c))
////               .collect(Collectors.joining(""))
////         )
////         .collect(Collectors.joining("")).length();
////      
////      System.out.println(aCount);
////      
////      int aCount2 = datas5
////         .stream()
////         .map(String::toLowerCase)
////         .filter(lowercase -> lowercase.contains("a"))
////         .map(str -> str.chars()
////               .filter(c -> c == 97)
////               .mapToObj(c -> String.valueOf((char)c))
////               .collect(Collectors.joining(""))
////               .length()
////         )
////         .mapToInt(n -> n)
////         .sum();
////      
////      System.out.println(aCount2);
////      System.out.println(datas5);
//      
////      6. 첫 번째 문자가 대문자인 문자열만 출력
////      "Apple", "banana", "Melon", "tomato"
////      ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
////      datas6
////         .stream()
////         .filter((str) -> str.charAt(0) >= 'A')
////         .filter((str) -> str.charAt(0) <= 'Z')
////         .forEach(System.out::println);
//      
////      7. 한글을 정수로 변경
////      "공일이삼" -> "0123"
////      String hangle = "공일이삼사오육칠팔구", message = "한글을 입력하세요.\nex)공일이삼", input = null;
////      Scanner sc = new Scanner(System.in);
////      System.out.println(message);
////      input = sc.next();
////      input.chars().map(hangle::indexOf).forEach(System.out::print);
//      
////      8. 정수를 한글로 변경
////      "0123" -> "공일이삼"
//      String hangle = "공일이삼사오육칠팔구", message = "정수를 입력하세요.\n0123", input = null;
//      Scanner sc = new Scanner(System.in);
//      System.out.println(message);
//      input = sc.next();
//      
//      input.chars().map(c -> c - 48)
//      .map(hangle::charAt)
//      .mapToObj(c -> String.valueOf((char)c))
//      .forEach(System.out::print);
	}
}
