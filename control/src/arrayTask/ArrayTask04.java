package arrayTask;

import java.util.Scanner;

public class ArrayTask04 {
	public static void main(String[] args) {
//      다이아
//      1. 계산기 만들기
//      사용자의 수식의 결과 값을 출력하는 계산기를 만드세요.
//      입력 예시1)
//      10 + 7 + 9
//      출력 예시1)
//      26
      
//      입력 예시2)
//      -7 + 8 + 11
//      출력 예시2)
//      12

//      힌트) 문자열의 메서드 .split()은 구분점으로 잘라 배열로 리턴하는 메서드이다.
//      자바에서는 구분점을 여러 개 전달할 수 있으며 여러개를 전달할 때에는 | 연산자를 이용한다
//      예를 들어 +, -를 구분점으로 자른다면 .split(\\+|\\-)로 전달해야한다.
//      \\는 제어문자가 아닌 문자열로 인식하기 위함이다.
//		String[] test = "-7 + 8 - 12 / 3".split(" \\+ | \\- | \\* | \\/ ");
//		for(int i = 0; i < test.length; i++) {
//			System.out.println(test[i]);
//		}
		
		String input = null;
		String[] inputSplit = null, operations = null, operNumSplit = null;
		double[] nums = null;
		double cal = 0;
		int operationCount = 0, numCount = 0, curOperaionsIndex = 0, curNumsIndex = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수식을 입력하세요 : ");
		input = sc.nextLine();
		
		//1.일단 문자열 분리(-7,+,8,-,12,*,3)
		//2.연산자, 피연산자 따로 저장. (-7,8,12,3) (+,-,*)
		//3.연산자배열에서 *혹은 /가있다면 피연산자인덱스,인덱스+1를 연산한다(*혹은/)
		//4.연산자,피연산자 배열 재할당 (ex : 12*3을연산후 배열 재할당하여 (-7,8,36) (+,-)
		//3-4번 반복하여 연산자배열에서 *혹은 /가었다면 순차적으로 연산
		
		inputSplit = input.split(" \\+ | \\- | \\* | \\/ ");
		operNumSplit = input.split("\\ ");
		
		//연잔자,피연산자 갯수구하기 (42,43,44,45)
		for(int i = 0; i < operNumSplit.length; i++) {
			//System.out.println(operNumSplit[i]);
			if((operNumSplit[i].charAt(0) == 42 || operNumSplit[i].charAt(0) == 43 || operNumSplit[i].charAt(0) == 45 || operNumSplit[i].charAt(0) == 47) && operNumSplit[i].length() == 1) {
				operationCount++;
			} else {
				numCount++;
			}
		}
		
		//연산자, 피연산자 따로 저장
		operations = new String[operationCount];
		nums = new double[numCount];
		
		//연산자, 피연산자 따로 저장
		for(int i = 0; i < operNumSplit.length; i++) {
			if((operNumSplit[i].charAt(0) == 42 || operNumSplit[i].charAt(0) == 43 || operNumSplit[i].charAt(0) == 45 || operNumSplit[i].charAt(0) == 47) && operNumSplit[i].length() == 1) {
				operations[curOperaionsIndex] = operNumSplit[i];
				curOperaionsIndex++;
			} else {
				nums[curNumsIndex] = Double.parseDouble(operNumSplit[i]);
				curNumsIndex++;
			}
		}
		
//		for(int i = 0; i < operations.length; i++) {
//			System.out.println("연산자 " + operations[i]);
//		}
//		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println("숫자 " + nums[i]);
//		}
		
		//System.out.printf("연산자 : %d, 숫자 : %d", operationCount, numCount);
		
		//*, /우선순위 계산
		while(true) {
			//*, / 연산
			Boolean isCalculate = false;
			int targetIndex = 0;
			double result = 0;
			for(int i = 0; i < operations.length; i++) {
				
//				for(int j = 0; j < operations.length; j++) {
//					System.out.print(operations[j]);
//				}
//				System.out.println();
				
				if(operations[i].charAt(0) == 42) {
//					System.out.print("곱");
					targetIndex = i;
					result = nums[i] * nums[i+1];
					isCalculate = true;
					break;
				} else if (operations[i].charAt(0) == 47) {
//					System.out.print("캮");
					targetIndex = i;
					result = nums[i] / nums[i+1];
					isCalculate = true;
					break;
				}
			}
			
			//연산후 배열 제거 및 재할당
			if(isCalculate) {
				double[] tmp = new double[nums.length - 1];
				for(int i = 0; i < tmp.length; i++) {
					if(i < targetIndex) {
						tmp[i] = nums[i];
					} else if(i == targetIndex) {
						tmp[i] = result;
					} else {
						tmp[i] = nums[i+1];
					}
				}
				
				String[] tmpStr = new String[operations.length - 1];
				for(int i = 0; i < tmpStr.length; i++) {
					if(i < targetIndex) {
						tmpStr[i] = operations[i];
					} else if(i >= targetIndex) {
						tmpStr[i] = operations[i+1];
					} 
				}
				
				nums = tmp.clone();
				operations = tmpStr.clone();
			} else {
				break;
			}
		}
		
		for(int i = 0; i < operations.length; i++) {
		System.out.println("연산자 " + operations[i]);
		}
	
		for(int i = 0; i < nums.length; i++) {
			System.out.println("숫자 " + nums[i]);
		}
		
		//이제 +, -연산자만 남았으므로 순차적으로 계산한다.
		
		if(nums.length != 0)
			cal = nums[0];
		
		for(int i = 0; i < operations.length; i++) {
			if(operations[i].charAt(0) == 43) {
				cal += nums[i+1];
				System.out.println(cal);
			} else if(operations[i].charAt(0) == 45) {
				cal -= nums[i+1];
				System.out.println(cal);
			}
		}
		
		System.out.printf("계산 결과 : %f", cal);
	}
}
