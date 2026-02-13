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
