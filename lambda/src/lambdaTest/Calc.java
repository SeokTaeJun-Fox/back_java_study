package lambdaTest;

//함수형 인터페이스 (메서드는 1개만)
@FunctionalInterface
public interface Calc {
	public int add(int num1, int num2);
}
