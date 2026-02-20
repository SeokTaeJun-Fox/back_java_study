package inheritanceTest;

class Animal {
	String name;
	
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("자기");
	}
	
	void poop() {
		System.out.println("배변 처리");
	}
	
	void walk() {
		System.out.println("걷기");
	}
}

// Person, Monkey, Cat, Snake
class Person extends Animal {}
class Monkey extends Animal {}
class Cat extends Animal {}
class Snake extends Animal {
	
	@Override	//@는 어노테이션 생략이 가능하지만 생략하면 안된다.
	void walk() {
		System.out.println("기어다니기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Person person = new Person();
		Monkey monkey = new Monkey();
		Cat cat = new Cat();
		Snake snake = new Snake();
		
//		person.eat();
//		person.sleep();
//		person.poop();
//		person.walk();
//		
//		monkey.eat();
//		monkey.poop();
		
//		뱀은 걸을 수 없다..
		snake.walk();
	}
}
