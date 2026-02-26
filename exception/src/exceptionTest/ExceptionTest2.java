package exceptionTest;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "채팅을 입력하세요.", input = null;
		
		try {
			input = sc.nextLine();
			
			if(input.contains("바보")) {
				throw new BadWordException("바보라고 치면 안 돼요!");
			}
			
			System.out.println(input);
		} catch (BadWordException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
