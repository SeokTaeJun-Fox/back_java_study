package classTest;

// 동물(Animal)
// 이름(name), 나이(age), 종류(species)
class Animal {
	String name;
	int age;
	String species;
	
//	기본 생성자
//	기본 생성자는 건드리면 안된다.
//	클래스를 만들면 기본생성자를 만들자
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
//	2. 초기화 생성자
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
}

// 토끼, 강아지, 고양이
//동물(Animal)
//public은 파일의 대장.
//파일 이름과 같은 것만 public으로 붙일 수 있다.
public class ClassTest {
	public static void main(String[] args) {
//		메모리에 할당 => new
//		
		Animal rabbit = new Animal("토깽이", 20, "토끼");
		Animal cat = new Animal("냥이1", 20, "고양이");
		
//		rabbit.name = "토깽이";
//		rabbit.age = 20;
//		rabbit.species = "토끼";
		
		System.out.println(rabbit.name);
	}
}
