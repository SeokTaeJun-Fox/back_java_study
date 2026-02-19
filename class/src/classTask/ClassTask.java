package classTask;

class Sports {
	
	String name;
	int howManyPeople;
	String origin;
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}
	
//	Shift + Alt + S => O : 초기화 생성자 만듦
	public Sports(String name, int howManyPeople, String origin) {
		this.name = name;
		this.howManyPeople = howManyPeople;
		this.origin = origin;
	}
}

//1. 스포츠(Sports) 추상화
//2. 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체 
//3. 기본 생성자, 초기화 생성자 생성 후 초기화
public class ClassTask {
	public static void main(String[] args) {
		Sports basketBall = new Sports("농구", 11, "아메리카");
		Sports baseBall = new Sports("야구", 9, "재팬");
		Sports soccer = new Sports("축구", 11, "자메이카");
		
		System.out.printf("이름 : %s, 인원 : %d, 원조 : %s\n", basketBall.name, basketBall.howManyPeople, basketBall.origin);
		System.out.printf("이름 : %s, 인원 : %d, 원조 : %s\n", baseBall.name, baseBall.howManyPeople, baseBall.origin);
		System.out.printf("이름 : %s, 인원 : %d, 원조 : %s\n", soccer.name, soccer.howManyPeople, soccer.origin);
	}
}
