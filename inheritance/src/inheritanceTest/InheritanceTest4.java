package inheritanceTest;

class Animal2 {
//	1. private 붙이자!
//	alt+shift+a : 영역선택해서 한번에 작성
	private String name;
	private int age;
	private String speices;
	private int numberOfLeg;
	private String gender;
	
//	2. 기본생성자
	public Animal2() {
		// TODO Auto-generated constructor stub
	}

//	3. 초기화 생성자
	public Animal2(String name, int age, String speices, int numberOfLeg, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.speices = speices;
		this.numberOfLeg = numberOfLeg;
		this.gender = gender;
	}

//	4. getter, setter
//	alt + shift + s > r > alt + a > r
//	천체 선택하고 generate
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpeices() {
		return speices;
	}

	public void setSpeices(String speices) {
		this.speices = speices;
	}

	public int getNumberOfLeg() {
		return numberOfLeg;
	}

	public void setNumberOfLeg(int numberOfLeg) {
		this.numberOfLeg = numberOfLeg;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}

public class InheritanceTest4 {
	public static void main(String[] args) {
		Animal2 animal = new Animal2();
		
		animal.setName("이규학");
		System.out.println(animal.getName());
	}
}
