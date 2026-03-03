package streamTask2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamTask2 {

//		   강사님 코드
//	   	   public static int add97(int num) {
//		      return num + 97;
//		   }
//		   
//		   public static boolean isOdd(int num) {
//		      return num % 2 != 0;
//		   }
//		   
//		   public static char valueOf(int num) {
//		      return (char)num;
//		   }
		   
	public static void main(String[] args) {
//      a...z까지 ArrayList에 담고
//      "acegi..." 문자열로 출력
		
		ArrayList<Character> chars = new ArrayList<Character>();
		for(int i = 0; i < 26; i++) {
			chars.add((char)(97+i));
		}
		
//		char > string으로 머지를 시키려면 stream<String>으로 변환하면 된다.
		String answer = chars
			.stream()
			.filter(x -> x%2 == 1)
			.map(String::valueOf)
			.collect(Collectors.joining());
		
		System.out.println(answer);

//		강사님 코드
//	      String result = IntStream
//	              .rangeClosed(0, 25)
//	              .map(StreamTask2::add97)
//	              .filter(StreamTask2::isOdd)
//	              .mapToObj(StreamTask2::valueOf)
//	              .map(String::valueOf)
//	              .collect(Collectors.joining(""));
//	           
//	        System.out.println(result);
	}
}
