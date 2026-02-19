package methodTask;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTest5 {
	
	int[] mokAndRemain(int x, int y) {
		int[] result = new int[2];
		
		result[0] = x/y;
		result[1] = x%y;
		
		return result;
	}
	
	int[] getMinMin2(int[] input) {
		int min1 = input[0], min2 = input[0];
		
		for(int i = 0; i < input.length; i++) {
			if(min1 > input[i]) {
				min1 = input[i];
			}
		}
		
		for(int i = 0; i < input.length; i++) {
			if(min2 > input[i] && min1 < input[i]) {
				min2 = input[i];
			}
		}
		
		return new int[] {min1, min2};
	}
	
	String removeDuplicate(String input) {
		char before = ' ';
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			if(before == input.charAt(i)) {
				continue;
			} else {
				output += input.charAt(i);
				before = input.charAt(i);
			}
		}
		
		return output;
	}
	
public static void main(String[] args) {
	MethodTest5 mt = new MethodTest5();
//  1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
   
//	Scanner sc = new Scanner(System.in);
//	int mok = 0, remain = 0;
//	
//	System.out.print("첫번째 값");
//	mok = sc.nextInt();
//	System.out.print("두번째 값");
//	remain = sc.nextInt();
//	
//	int[] result = mt.mokAndRemain(mok, remain);
//	System.out.printf("몫 : %d, 나머지 : %d",result[0], result[1]);
	
//  2. 사용자가 입력하는 값중 정수 분리하기
//  입력 예시)
//  안1녕2하3세4요
//  출력 예시)
//  1234
	
	
  
//  3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//  입력 예시) apple
//  찾을 글자 p
//  반환 2
  
//  4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
	
	int[] input = new int[] {90, 40, 30, 60, 80}, result = mt.getMinMin2(input);
	System.out.printf("%d %d", result[0], result[1]);
  
//  5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
  
//  6. 연속된 중복 문자 제거하기
//  입력 예시1)
//  abbbbacda
//  출력 예시1)
//  aacda
  
//  입력 예시2)
//  aabbccccd
//  출력 예시2)
//  abcd
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("문자열을 입력하세요.");
//	String input = sc.next(), output = null;
//	output = mt.removeDuplicate(input);
//	
//	System.out.printf("결과 %s", output);
	
}
}

//package methodTask;
//
//import java.util.Scanner;
//
//public class MethodTask5 {
//   int[] getDivide(int data1, int data2) {
//      return new int[] {data1 / data2, data1 % data2};
//   };
//   
//   String getIntegerString(String input) {
//      String result = "";
//      for(int i = 0; i < input.length(); i++) {
//         int c = input.charAt(i) - 48;
//         if(c >= 1 && c <= 9) {
//            result += (char)(c + 48);
//         }
//      }
//      return result;
//   }
//
//   int getCount(String expression, char c) {
//      int count = 0;
//      for(int i = 0; i < expression.length(); i++) {
//         if(expression.charAt(i) == c) {
//            count++;
//         }
//      }
//      return count;
//   }
//   
//   int[] getMinArray(int[] datas) {
//      int[] minArray = new int[2];
//      int min1 = datas[0], min2 = datas[1];
//      for(int i = 0; i < datas.length; i++) {
//         if(min1 > datas[i]) {
//            min1 = datas[i];
//         }else if(datas[i] > min1 && min2 >= datas[i]){
//            min2 = datas[i];
//         }
//      }
//      minArray[0] = min1;
//      minArray[1] = min2;
//      return minArray;
//   }
//   
//   int getTotalOdd(int[] datas) {
//      int result = 0;
//      for(int i = 0; i < datas.length; i++) {
//         if(datas[i] % 2 == 1) {
//            result += datas[i];
//         }
//      }
//      return result;
//   }
//   
//   String getRemoveString(String input) {
//      String result = "";
//      for(int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i);
//         if(!result.contains(String.valueOf(c))) {
//            result += c;
//         }
//      }
//      return result;
//   }
//   
//   
//   public static void main(String[] args) {
//      MethodTask5 mt = new MethodTask5();
////      플레티넘 ~ 다이아
////      1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
////      int[] datas = new MethodTask5().getDivide(10, 20);
////      for(int data : datas) {
////         System.out.println(data);
////      }
//      
//      
////      2. 사용자가 입력하는 값 중 정수 분리하기
////      입력 예시)
////      안1녕2하3세4요
////      출력 예시)
////      1234
//      
////      .charAt()
////      Scanner sc = new Scanner(System.in);
////      String input = null, message = "정수를 분리할 글자를 입력하세요\n안1녕", result = null;
////
////      System.out.println(message);
////      input = sc.next();
////      result = mt.getIntegerString(input);
//      
////      System.out.println(result);
//      
//      
////      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
////      입력 예시) apple
////      찾을 글자 p
////      반환 2
////      Scanner sc = new Scanner(System.in);
////      String input = null, message = "문자열과 찾을 글자를 입력하세요.\nex)abcd", result = null;
////      
////      System.out.println(message);
////      input = sc.next();
////      int count = mt.getCount(input, 'a');
////      System.out.println(count);
//      
////      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
////      int[] datas = {10, 40, 1, 10};
////      System.out.println(mt.getMinArray(datas)[0]);
////      System.out.println(mt.getMinArray(datas)[1]);
//      
//      
////      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
////      int[] datas = new int[100];
////      int result = 0;
////      for(int i = 0; i < datas.length; i++) {
////         datas[i] = (int)(Math.random() * 100);
////      }
////      
////      System.out.println(mt.getTotalOdd(datas));
//      
////      6. 연속된 중복 문자 제거하기
////      입력 예시1)
////      abbbbacda
////      출력 예시1)
////      abacda
//      
////      입력 예시2)
////      aabbccccd
////      출력 예시2)
////      abcd
//      Scanner sc = new Scanner(System.in);
//      String input = null, message = "중복을 제거할 문자를 입력하세요.\naabbccccd", result = "";
//      
//      System.out.println(message);
//      input = sc.next();
//      
//      System.out.println(mt.getRemoveString(input));
//      
//   }
//}












