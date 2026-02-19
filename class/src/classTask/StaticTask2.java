package classTask;

//학생(Student)
//이름, 학번, 국어점수, 영어점수, 수학점수
//학생들은 총점과 평균을 출력해주는 메서드를 가지고 있습니다.
//또한 학생들의 총 숫자를 출력할 수 있습니다.
//필요시 필드는 추가로 구현할 수 있습니다.


//학생 3명을 객체화 하고
//각각 학생의 총점과 평균을 출력
//학생의 총 수를 출력

class Student {
	//컴파일러가 초기화를 시켜준다.
	String name;	//null
	String num;		//null
	int korean;		//0
	int english;	//0
	int math;		//0
	
	static int studentCount;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String num, int korean, int english, int math) {
		this.name = name;
		this.num = num;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public int getTotalScore() {
		return korean + english + math;
	}
	
	public double getAverageScore() {
		return getTotalScore()/3.0;
	}
	
//	스태틱 블럭
//	객체가 맨처음 인스턴스가될때 딱 한번
	static {
		System.out.println("시작");
	}
	
	{
//		초기화 블럭 (인스턴스가 호출될 때마다 실행)
//		생성자 먼저 호출되고 초기화 블럭이 실행된다.
		studentCount++;
	}
}

public class StaticTask2 {
	public static void main(String[] args) {
		Student s1 = new Student("URA", "2013211731", 50, 60, 80);
		Student s2 = new Student("this", "2013211732", 40, 50, 90);
		Student s3 = new Student("DaNon", "2013211733", 30, 65, 85);
		
		System.out.printf("이름 : %s, 학번 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 %.2f\n", s2.name, s2.num, s2.korean, s2.english, s2.math, s2.getTotalScore(), s2.getAverageScore());
		System.out.printf("이름 : %s, 학번 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 %.2f\n", s1.name, s1.num, s1.korean, s1.english, s1.math, s1.getTotalScore(), s1.getAverageScore());
		System.out.printf("이름 : %s, 학번 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 %.2f\n", s3.name, s3.num, s3.korean, s3.english, s3.math, s3.getTotalScore(), s3.getAverageScore());
		System.out.println(Student.studentCount);
	}
}
