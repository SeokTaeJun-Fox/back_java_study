package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		//(int num1, int num2) => (num1, num2) 자료형은 생략이 가능하다
//		Calc calc = (num1, num2) -> {return num1 + num2;};	//중괄호를 추가하면 비즈니스 로직 가능
		Calc calc = (num1, num2) -> num1 + num2;
		Calc2 calc2 = (num1, num2) -> num1 / (double)num2;
		
		System.out.println(calc2.divide(10, 3));
	}
}
