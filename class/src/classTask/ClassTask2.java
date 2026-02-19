package classTask;

// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔
class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	String passWord;
	
	int errorCount;
	
	public SuperCar() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SuperCar(String brand, String color, int price, boolean engine, String passWord) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
		this.passWord = passWord;
	}


	public void changeEngine(String passWord, boolean engineState) {
		if(errorCount == 3) {
			System.out.println("오류횟수 3회이므로 엔진을 조작할 수 없습니다.");
			return;
		}
		
		if (this.passWord.equals(passWord)) {
			engine = engineState;
			System.out.printf("엔진 %s\n", engineState ? "On" : "Off");
		} else {
			errorCount++;
			System.out.println("비밀번호" + errorCount + "회오류");
			if(errorCount == 3) {
				callPolice();
			}
		}
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s, 색상 : %s, 가격 : %d, 엔진 : %b, 비밀번호 : %s, 오류횟수 : %d", this.brand, this.color, this.price, this.engine, this.passWord, this.errorCount);
	}
	
	private void callPolice() {
		System.out.println("에러 횟수 3회로 경찰 출동합니다.");
	}
}

public class ClassTask2 {
   
   public static void main(String[] args) {
//   1. 슈퍼차 객체화
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//   3. 비밀번호 3회 오류시 경찰 출동
	   
	 SuperCar myCar = new SuperCar("URA", "Gray", 10000, false, "석댕이");
	 myCar.changeEngine("개띠 태주니는 댕댕이", false);
	 myCar.changeEngine("석냥이", true);
	 myCar.changeEngine("석댕이", false);
	 myCar.changeEngine("석댕이", true);
	 myCar.getInfo();
   }

}
