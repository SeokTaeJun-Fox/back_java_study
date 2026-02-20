package inheritanceTask;

//상속 및 분리 실습
//
//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다

class PersonTask {
	String name;
	int age;
	String address;
	String phone;
	
	public PersonTask() {
		// TODO Auto-generated constructor stub
	}

	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	void work() {
		System.out.println("일을 한다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}

//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다

class StudentTask extends PersonTask {
	String instaId;
	
	public StudentTask() {

	}
	
	
	public StudentTask(String name, int age, String address, String phone, String instaId) {
		super(name, age, address, phone);
		this.instaId = instaId;
	}


	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
}

//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다

class EmployeeTask extends PersonTask {
	int money;
	
	public EmployeeTask() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeTask(String name, int age, String address, String phone, int money) {
		super(name, age, address, phone);
		this.money = money;
	}
	

	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
}

//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
	public static void main(String[] args) {
		PersonTask p1 = new PersonTask("석수최", 33, "신림동", "010-1234-5678");
		StudentTask s1 = new StudentTask("URA", 33, "역삼동", "010-1234-5678", "my name is URA");
		EmployeeTask e1 = new EmployeeTask("DaNon", 33, "잠실동", "010-1234-5678", 10000);
		
		p1.work();
		p1.sleep();
		p1.eat();
		
		s1.work();
		s1.sleep();
		s1.eat();
		
		e1.work();
		e1.sleep();
		e1.eat();
	}
}
