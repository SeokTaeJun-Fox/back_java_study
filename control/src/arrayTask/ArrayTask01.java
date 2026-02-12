package arrayTask;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력
		
//		int[] nums = new int[100];
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = i+1;
//		}
//		
//		for (int i = 0; i < nums.length; i++) {
//			if(nums[i]%2 != 0) {
//				System.out.println(nums[i]);
//			}
//		} 

//      2. 10~1까지 중 짝수만 배열에 담고 출력
		
//		int[] evens = new int[5];
//		int targetIndex = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			int target = 10 - i;
//			if(target%2 == 0) {
//				evens[targetIndex] = target;
//				targetIndex++;
//			}
//		}
//		
//		for (int i = 0; i < evens.length; i++) {
//			System.out.println(evens[i]);
//		}
		
//      3. 1~77까지 중 짝수만 배열에 담고 출력
		
//		int[] evens = new int[38];
//		int targetIndex = 0;
//		
//		for(int i = 0; i < 77; i++) {
//			int target = i + 1;
//			if(target%2 == 0) {
//				evens[targetIndex] = target;
//				targetIndex++;
//			}
//		}
//		
//		for(int i = 0; i < evens.length; i++) {
//			System.out.println(evens[i]);
//		}
      
//      실버
//      A~F까지 배열에 담고 출력
		
//		char[] chars = new char[6];
//		
//		for(int i = 0; i < chars.length; i++) {
//			chars[i] = (char)('A' + i);
//		}
//		
//		for (int i = 0; i < chars.length; i++) {
//			System.out.println(chars[i]);
//		}
		
//      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int min = 0, max = 0;
		String resultFormat = "최댓값 : %d, 최솟값 : %d";
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수 5개를 입력하세요 : ");
			nums[i] = sc.nextInt();
		}
		
		min = nums[0];
		max = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.printf(resultFormat, max, min);
	}
}
