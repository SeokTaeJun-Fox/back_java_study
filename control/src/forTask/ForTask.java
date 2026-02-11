package forTask;

import java.io.Console;
import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//      1~10까지 반복 후 5~8을 제외하고 출력
//		for(int i = 0; i < 10; i++) {
//			int target = i + 1;
//			//if(target < 5 || target > 8) {
//			if((target-1) / 4 != 1 ) {
//				System.out.println(target);
//			}
//		}
		
//      브론즈
//      1. 1~100까지 출력
//      2. 100~1까지 출력
//		for(int i = 0; i < 100; i++) {
//			int target = i + 1;
//			System.out.println("결과: " + target);
//		}
//		
//		for (int i = 0; i < 100; i++) {
//			int target = 100 - i;
//			System.out.println("결과: " + target);
//		}
      
//      골드
//      1. 1~10까지 누적합을 출력
//      2. 1~n까지 누적합 출력

//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
//			int target = i + 1;
//			sum += target;
//		}
//		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("누적의 횟수를 구하시오 : ");
//		int count = sc.nextInt();
//		
//		int sum = 0;
//		for(int i = 0; i < count; i++) {
//			int target = i + 1;
//			sum += target;
//		}
//		System.out.println("결과: " + sum);
      
//      플레티넘
//      1. A~F까지 출력
//      2. A~F까지 중 C를 제외하고 출력
		
//		for(int i = 0; i < 6; i++) {
//			char target = (char)('A' + i);
//			System.out.print("결과: " + target);
//		}
//		
//		for(int i = 0; i < 6; i++) {
//			char target = (char)('A' + i);
//			if(target != 'C') {
//				System.out.print("결과: " + target);
//			}
//		}
      
//      다이아
//      1. aBcDeFg...Z 출력
//      2. 별찍기 
//        *
//       ***
//      *****
		
//		int gap = 32;
//		for(int i = 0; i < 26; i++) {
//			char target = i % 2 == 0 ? (char)('A' + i + 32) : (char)('A' + i);
//			System.out.print("결과 : " + target);
//		}
		
		//0 1 2(v) 3 4			
		//0 1(v) 2(v) 3(v) 4
		//n = 2f-1   
		//n/2 +- y (y는 0~f)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("층을 입력하세요:");
//		int floor = 0, width = 0;
//		
//		floor = sc.nextInt();
//		width = floor * 2 - 1;
//		
//		for(int i = 0; i < floor; i++) {
//			for(int j = 0; j < width; j++) {
//				if(j >= width/2 - i && j <= width/2 + i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
      
//      마스터
//      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//      입력 예시) a1b3c2
//      출력 예시) abbbcc
		
		//1. 문자 형식을 입력받음
		//2. 2로 나눠서 각자 처리
		//3. 첫번째는 문자열저장 두번째는 정수저장 하고 output에다가 저장후 반복
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자를 쓰세요: (ex: a1b3c2)");
//		
//		String input = sc.next(), output = "";
//		int loopCount = input.length()/2;
//		
//		for(int i = 0; i < loopCount; i++) {
//			String targetChar = String.valueOf(input.charAt(2*i));
//			int loop = Integer.parseInt(String.valueOf(input.charAt(2*i+1)));
//			
//			for(int j = 0; j < loop; j++) {
//				output += targetChar;
//			}
//		}
		
      
//      2. 사용자가 입력한 횟수가 얼마인지 모르고,
//      입력한 횟수 만큼 문자를 만들어주는 프로그램
//      입력 예시) a1b22c357
//      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
		
		//1. 입력한 갯수만큼 반복문 돌림
		//2. 내부에 타겟인덱스가 숫자가 아니면 a에 저장후 다음 for문
		//2-1. 내부에 타겟인덱스가 숫자면 b에 저장후 다음 for문
		//2-2. 내부에 타겟인덱스가 숫자면 b에 누적해서 저장후 다음 for문
		//2-3-0. 첫 진입이면 a에 문자열만 저장후 다음 for문
		//2-3. 내부에 타겟인덱스가 문자면 ouput에 b에 저장된 문자열을 a에 반복해서 누적합시킴 그 후 a에 문자열 저장 후 다음 for 문
		//3. 마지막 순간
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 쓰세요: (ex: a22b3c15)");
		String numList = "0123456789", input = sc.next(), output = "", targetChar = null, loop = "";
		
		for(int i = 0; i < input.length(); i++) {
			String target = String.valueOf(input.charAt(i));
			
			//해당 인덱스 값이 숫자면 loop에 숫자문자열 누적합,
			//그렇지 않으면 loop값이 비어있으면 continue. 그렇지 않으면 targetChar에 저장 및 output에 targetChar을 loop횟수만큼 누적합
			//그 후 loop, targetChar 초기화
			if(numList.contains(target)) {
				loop += target;
			} else {
				//첫 진입시
				if(loop.equals("")) {
					targetChar = target;
					continue;
				}
				
				int loopCount = Integer.parseInt(loop);
				for(int j = 0; j < loopCount; j++) {
					output += targetChar;
				}
				
				loop = "";
				targetChar = target;
			}
			
			//마지막 output 누적 저장
			if(i == input.length() - 1) {
				
				if(loop.equals("")) {
					continue;
				}
				
				int loopCount = Integer.parseInt(loop);
				for(int j = 0; j < loopCount; j++) {
					output += targetChar;
				}
			}
		}
		
		System.out.println("출력" + output);
		
// 마스터2 다른 풀이	
//	      Scanner sc = new Scanner(System.in);
//	      String message = "문자 + 숫자 형식의 문자열을 입력하세요.\nex)a1b22c347",
//	            input = null, result = "";
//	      
//	      System.out.println(message);
//	      input = sc.next();
//	      
//	      for(int i = 0; i < input.length(); i++) {
//	         char c = input.charAt(i); // 문자
//	         
//	         String numberStr = "";
//	         i++;
////	         다음 문자부터 숫자 읽기 시작
//	         while(i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
//	            numberStr += input.charAt(i);
//	            i++;
//	         }
//	         
//	         int count = Integer.parseInt(numberStr);
//	         
//	         for(int j = 0; j < count; j++) {
//	            result += c;
//	         }
//	         i--;
//	      }
//	      
//	      System.out.println(result);
	}
}
