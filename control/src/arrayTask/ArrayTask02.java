package arrayTask;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask02 {
//  골드
//  1. 사용자가 몇 개를 입력할 지 모를 때,
//  입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
  public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input = null, inputInfo = "";
//		String[] stringNums = null;
//		double[] nums = null;
//		double min = 0, max = 0;
//		
//		while(true) {
//			System.out.print("정수를 입력하세요. (캮)입력시 종료됩니다.");
//			input = sc.next();
//			
//			if(!input.equals("캮")) {
//				inputInfo += input;
//				inputInfo += ",";
//			}
//			else {
//				inputInfo += input;
//				break;
//			}
//		}
//		
//		stringNums = inputInfo.split(",");
//		nums = new double[stringNums.length - 1];
//		
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = Double.parseDouble(stringNums[i]);
//		}
//		
//		if(nums.length > 0) {
//			min = nums[0];
//			max = nums[0];
//		}
//		
//		for(int i = 1; i < nums.length; i++) {
//			if(min > nums[i]) {
//				min = nums[i];
//			}
//			
//			if(max < nums[i]) {
//				max = nums[i];
//			}
//		}
//		
//		System.out.printf("최댓값 : %.2f, 최솟값 : %.2f", max, min);
		
	//  2. 사용자가 몇 개를 입력할 지 모를 때,
	//  입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
	//  입력예시) "10", "10.7", "2", "3.6"
	//  출력예시) 실수 2개, 정수 2개
		
		Scanner sc = new Scanner(System.in);
		String input = null, inputInfo = "";
		String[] stringNums = null;
		int intCount = 0, doubleCount = 0;

		while(true) {
			System.out.print("정수를 입력하세요. (캮)입력시 종료됩니다.");
			input = sc.next();
			
			if(!input.equals("캮")) {
				inputInfo += input;
				inputInfo += ",";
			}
			else {
				inputInfo += input;
				break;
			}
		}
		
		stringNums = inputInfo.split(",");
		
		for(int i = 0; i < stringNums.length - 1; i++) {
			if(stringNums[i].contains(".")) {
				doubleCount++;
			} else {
				intCount++;
			}
		}
		
		System.out.printf("정수갮수 : %d, 실수 갯수 : %d", intCount, doubleCount);
  }
}