package inputTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요.ex)홍 길동", name = null, lastName = null, firstName = null;
		
		System.out.println(message);
//		lastName = sc.next();
//		firstName = sc.next();
//		System.out.println(firstName + "님 환영합니다.");
		
		name = sc.nextLine();
		System.out.println(name + "님 환영합니다.");
	}
}
