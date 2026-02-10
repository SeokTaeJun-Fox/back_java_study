package inputTask01;

// Ctrl + Shift + O
import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
	      // Scanner를 사용하여, 두 정수를 입력 받고,
	      // 덧셈 결과를 출력하시오.
	      // 단 next()만 사용
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = null, num2 = null, resultFormat = null;
		int sum = 0;
		
		resultFormat = "%s + %s = %d";
		
		System.out.println("숫자를 입력하세요. ex)10 20");
		num1 = sc.next();
		num2 = sc.next();
		
		sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.printf(resultFormat, num1, num2, sum);
	}
}
