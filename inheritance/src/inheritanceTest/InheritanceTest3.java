package inheritanceTest;

class Car {
//	브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	엔진을 켜기 출력
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	
//	엔진을 끄기 출력
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}

class SuperCar extends Car {
	String mode;
	public SuperCar() {
	
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
//		상속시에는 부모의 초기화 생성자(super)를 이용해서 초기화 해야 한다.
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("버튼으로 시동 켬");
	}
	
	@Override
	void engineStop() {
		System.out.println("버튼으로 시동 끔");
	}
}

public class InheritanceTest3 {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 70_000, "Sports");
		Car matiz = new Car("Matiz", "Red", 700);
//		System.out.println(ferrari.brand);
//		System.out.println(matiz.brand);
		
		ferrari.engineStart();
		matiz.engineStart();
		
//		상속
//		부모의 필드, 메서드
//		+ 부모의 타입
		
//		상속에서 타입을 비교하는 문법: 객체 instance of 타입
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);	//자식과 부모가 주소가 똑같다

//		결론 모든 자식은 부모 타입이다.
	}
}
