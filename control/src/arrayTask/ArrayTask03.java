package arrayTask;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
//      플레티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 모두 배열에 담고 출력
//      입력 예시) 안녕hi!
//      출력 예시) 안녕HI!

//		Scanner sc = new Scanner(System.in);
//		String input = null, output = "";
//		char[] inputChar = null;
//		
//		System.out.print("문자열을 입력하세요 : ");
//		input = sc.nextLine();
//		
//		inputChar = new char[input.length()];
//		
//		for(int i = 0; i < inputChar.length; i++) {
//			if(input.charAt(i) >= 65 && input.charAt(i) <= 90) {
//				inputChar[i] = (char)(input.charAt(i) + 32);
//			} else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
//				inputChar[i] = (char)(input.charAt(i) - 32);
//			} else {
//				inputChar[i] = input.charAt(i);
//			}
//		}
//		
//		
//		for(int i = 0; i < inputChar.length; i++) {
//			output += inputChar[i];
//			//System.out.println(inputChar[i]);
//		}
//		
//		System.out.printf("변환된 문자열은 %s입니다.", output);
		
//      2. 사용자가 입력한 모든값을 반대로 뒤집어서 모두 배열에 담고 결과를 출력
//      입력 예시) apple
//      출력 예시) elppa
		Scanner sc = new Scanner(System.in);
		String input = null, output = "";
		char[] inputChars = null, outputChars = null;
		
		System.out.print("문자열을 입력하세요 : ");
		input = sc.nextLine();
		
		inputChars = new char[input.length()];
		outputChars = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			inputChars[i] = input.charAt(i);
		}
		
		for (int i = 0; i < inputChars.length; i++) {
			outputChars[i] = inputChars[inputChars.length - 1 - i];
			output += outputChars[i];
		}
		
		System.out.printf("변환된 문자열은 %s입니다.", output);
	}
}
