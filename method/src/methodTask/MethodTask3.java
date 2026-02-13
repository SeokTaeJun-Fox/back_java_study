package methodTask;

import java.util.Iterator;

public class MethodTask3 {
	
	void convertToInteger(String[] target) {
		String list = "공일이삼사오육칠팔구";
		String result = "";
		
		for(int i = 0; i < target[0].length(); i++) {
			result += list.indexOf(target[0].charAt(i));
		}
		
		target[0] = result;
	}
	
	void converToString(String[] target) {
		String list = "공일이삼사오육칠팔구";
		String result = "";
		
		for(int i = 0; i < target[0].length(); i++) {
			result += list.charAt(target[0].charAt(i) - '0');
		}
		
		target[0] = result;
	}
	
	void createLotto(int[] paper) {
		int targetIndex = 1;
		paper[0] = (int)(Math.floor(Math.random() * 45)+1);
		
		while(targetIndex != 6) {
			int input = (int)(Math.floor(Math.random() * 45)+1);
			Boolean isCheck = true;
			for(int i = 0; i < targetIndex; i++) {
				if(paper[i] == input) {
					isCheck = false;
					break;
				}
			}
			
			if(isCheck) {
				paper[targetIndex] = input;
				targetIndex++;
			}
		}
	}
	
	public static void main(String[] args) {	
		
		MethodTask3 mt = new MethodTask3();
		
//      번외 로또 추첨하기
//      로또 번호 6개를 배열에 담아서 결과를 반환해주는 메서드
//      System.out.println(Math.floor(Math.random() * 45)+1);
		int[] lotto = new int[6];
		mt.createLotto(lotto);
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
		
//		단 반드시 배열을 사용해야 함
//      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
		String[] input = {"일공이사"};
		mt.convertToInteger(input);
		System.out.println(input[0]);
		
//      2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
		String[] input2 = {"1024"};
		mt.converToString(input2);
		System.out.println(input2[0]);
	}
}
