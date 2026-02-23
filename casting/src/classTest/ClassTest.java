package classTest;

// 부모
class Car {
	public Car() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동을 킴");
	}
}

//자식
class SuperCar extends Car {
	public SuperCar() {
		// TODO Auto-generated constructor stub
	}
	
//	부모의 코드
	@Override
	void engineStart() {
		System.out.println("음성으로 시동을 킴");
	}
	
//	자식의 코드
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
}

public class ClassTest {
	public static void main(String[] args) {
		//넘치는건 괜찮아 부족한건 안돼
		//person => student 안됀다.
		//student => person 됀다.
		//업캐스팅하면 자식 코드는 쓸수없다. 자식 코드는 숨어있다.
		//업캐스팅 객체만 다운캐스팅이 가능하다. person = (person)new sutdent() 안됌
		//(student)person; 가능
		//다운캐스팅한 객체는 자식 코드는 사용할수있다. 자식 코드는 드러낸다.
		
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar();
		
//		up casting 객체와 부모의 객체는 다르다.
//		- 오버라이딩된 메서드의 결과가 다르다.
		matiz.engineStart();
		noOptionFerrari.engineStart();
		
//		error 부족하면 안됀다.
//		SuperCar fullOptionFerrari = new Car();
		
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
	}
}
