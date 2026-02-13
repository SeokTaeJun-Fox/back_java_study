package methodTest;

public class MethodTest {
// 이름을 받으면 이름을 출력하는 메서드
	void printName(String name) {
		System.out.println(name);
	};
	
// 두 수를 더해서 결과를 반환하는 메서드
	double add(double num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		//객체화
		MethodTest mt = new MethodTest();
		
		//Java는 메모리에 할당하지 않은 메서드를 사용할 수 없다.
		System.out.println(mt.add(10, 20));
		
		new MethodTest().printName("홍길동");
	}
}
