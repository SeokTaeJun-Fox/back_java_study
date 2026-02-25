package lambdaTask2;

import java.util.function.DoublePredicate;

public class LambdaTask2 {
	public static void main(String[] args) {
//      1) 문자열과 정수형을 전달하면 정수형마다 글자를 건너뛰고 반환(리턴)하는 메서드
//      입력 예시)
//      "abcdabcd", 4
      
//      출력 예시
//      "abcabc"
		
		SkipString skip = (input, num) -> {
			int checkIndex = 0;
			String newString = "";
			for(int i = 0; i < input.length(); i++) {
				if((i+1)%num == 0) {
					continue;
				} else {
					newString += input.charAt(i);
				}
			}
			return newString;
		};
		
		System.out.println(skip.skipString("내이름은URA", 3));
      
//      2) 문자열과 문자형을 전달하면 찾은 문자열의 인덱스에 해당하는 글자를 반환(리턴) 메서드
//      없을 시 -1
//      "abcdabcd", 'a'
//      출력 결과
//      "c"
		
		CountAndFindChar findChar = (input, ch) -> {
			int find = 0;
			String output = null;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == ch) {
					find++;
				}
			}
			
			return find == 0 ? "-1" : "" + input.charAt(find);
		};
		
		System.out.println(findChar.findChar("abcddabcddefgdd", 'd'));
      
//      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//      입력 예시
//      "가나다라마바사가나다라가나다"
      
//      출력 예시
//      "가나다라마바사"
		
		RemoveDuplicateString removeDuplicateString = (input) -> {
			String newString = "";
			
			for(int i = 0; i < input.length(); i++) {
				if(!newString.contains(""+input.charAt(i))) {
					newString += input.charAt(i);
				}
			}
			
			return newString;
		};
		
		System.out.println(removeDuplicateString.remove("abcdedabcddegssefiglsan"));
      
//      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//      입력 예시
//      "123456789"
      
//      출력 예시
//      "987654321"
		
		MakeUpsidedownString makeUpsidedownString = (input) -> {
			String newString = "";
			for(int i = 0; i < input.length(); i++) {
				newString += input.charAt(input.length() - i - 1);
			}
			
			return newString;
		};
		
		System.out.println(makeUpsidedownString.play("abcdefg"));
	}
}
