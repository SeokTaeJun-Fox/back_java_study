package methodTask;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask4 {
	
	String convertToHangeul(String num) {
		String list = "공일이삼사오육칠팔구", unit = "백십", result = "", unsightNum = null;
		
		String[] numSplit = num.split("\\."), zaritsu = {"", "십", "백"};
		int remainZaritsu = 0;
		
		// 마이너스 판별
		if (numSplit[0].length() != 0 && numSplit[0].contains("-")) {
			result += "마이너스";
		}
		unsightNum = numSplit[0].replace("-","");
		
		remainZaritsu = unsightNum.length();
		
		//System.out.println(unsightNum);
		
		//정수자리 변환
		for(int i = 0; i < remainZaritsu; i++) {
			int zaritsuIndex = remainZaritsu - i - 1;
			
			if(unsightNum.charAt(i) == '0') {
				continue;
			} else if (unsightNum.charAt(i) == '1') {
				result += (zaritsuIndex == 0 ? "일" : "");
				result += zaritsu[zaritsuIndex];
			} else {
				result += list.charAt(unsightNum.charAt(i) - '0');
				result += zaritsu[zaritsuIndex];
			}
		}
		
		result += (numSplit.length == 2 ? "점" : "");
		
		//소수자리 변환
		if(numSplit.length == 2) {
			for(int i = 0; i < numSplit[1].length(); i++) {
				result += list.charAt(numSplit[1].charAt(i) - '0');
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
//      사용자는 1 ~ 999까지만 입력가능
	      
//      마스터
//      1. 소수 변환기
//      사용자의 입력값을 읽어 문자열로 출력하시오
//      입력 예시1)
//      12.34
//      출력 예시1)
//      십이점삼사
      
//      입력 예시2)
//      -57
//      출력 예시2)
//      마이너스오십칠
      
//      -237.27
//      마이너스이백삼십칠점이십칠
		
//		마이너스 확인
//		자릿수 확인
//		점 확인
		
		MethodTask4 mt = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요(ex: -237.37) : ");
		String num = sc.next();
		String result = mt.convertToHangeul(num);
		System.out.println(result);
	}
}

//package methodTask;
//
//public class MethodTask4 {
//   
//   public String convertFormat(int num) {
//      String[] nums = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//      String[] units = {"", "십", "백", "천"};
//      String result = "";
//      int temp = num;
//      
//      for(int i = 0; i < units.length; i++) {
//         int digit = temp % 10;
//         if(digit != 0) {
//            result = nums[digit] + units[i] + result;
//         }
//         temp /= 10;
//      }
//      
//      return result;
//   }
//   
//   String numberToHanglesUnit(int num) {
//      String result = "";
//      
//      int man = num / 10000;
//      int rest = num % 10000;
//      
//      if(man > 0) {
//         result += this.convertFormat(man) + "만";
//      }
//
//      if(rest > 0) {
//         result += this.convertFormat(rest);
//      }
//      
//      if(num == 0) {
//         result = "영";
//      }
//      
//      return result;
//   }
//   
//
//   String numberToHangles(String number) {
//      String integerPartStr = "", floatPartStr = "", result = "";
//      
//      int integerPart = 0;
//      double floatNumber = 0.0, floatPart = 0.0;
//
//      floatNumber = Double.parseDouble(number);
//      
//      if (floatNumber < 0) {
//         result += "마이너스";
//      }
//      
//      integerPartStr = number.split("\\.")[0];
//      floatPartStr = number.split("\\.")[1];
//      
//      
////      정수 부분
//      integerPart = Integer.parseInt(integerPartStr) * -1;
//      result += this.numberToHanglesUnit(integerPart);
//      
//      floatPart = Integer.parseInt(floatPartStr);
//      
////      소수 부분
//      if(floatPart > 0) {
//         result += "점";
//         result += this.numberToHanglesUnit((int)floatPart);
//      }
//      
//      return result;
//   }
//   
//   
//   public static void main(String[] args) {
//      
////      사용자는 1 ~ 999까지만 입력가능
//      
////      마스터. 1
////      1. 소수 변환기
////      사용자의 입력값을 읽어 문자열로 출력하시오
////      입력 예시1)
////      12.34
////      출력 예시1)
////      십이점삼사
//      
////      입력 예시2)
////      -57
////      출력 예시2)
////      마이너스오십칠
//      
////      -237.27
////      마이너스이백삼십칠점이십칠
//      
//      MethodTask4 mt4 = new MethodTask4();
//      System.out.println(mt4.numberToHangles("17.1"));
//      System.out.println(mt4.numberToHangles("-127.18"));
//      
//      
//      
//   }
//}









