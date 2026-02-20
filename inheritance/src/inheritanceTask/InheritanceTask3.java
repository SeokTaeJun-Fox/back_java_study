package inheritanceTask;

//Phone
//이름, 브랜드, 가격
//문자발신 sms()
//전화 call()

class Phone {
	private String name;
	private String brand;
	private int price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Phone(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void sms() {
		System.out.println("문자 메시지");
	}
	
	public void call() {
		System.out.println("전화 통화");
	}
}

//Phone2G
//인터넷

class Phone2G extends Phone {
	public Phone2G() {
		
	}
	
	public Phone2G(String name, String brand, int price) {
		super(name, brand, price);
	}
	
	public void Internet() {
		System.out.println("요금 폭탄 인터넷 실행");
	}
}


//Phone3G
//인터넷, 영상통화

class Phone3G extends Phone2G {
	public Phone3G() {
		// TODO Auto-generated constructor stub
	}
	
	public Phone3G(String name, String brand, int price) {
		super(name, brand, price);
	}
	
	@Override
	public void Internet() {
		System.out.println("인터넷 실행");
	}
	
	public void videoCall() {
		System.out.println("영상 통화 실행");
	}
}

//Phone2G, Phone3G 객체화
//Phone2G: 인터넷 메서드를 호출
//Phone3G: 영상통화 메서드 호출

public class InheritanceTask3 {
	public static void main(String[] args) {
		Phone2G phone2g = new Phone2G("URA", "Android-790", 10000);
		Phone3G phone3g = new Phone3G("DaNon", "Android-450", 20000);
		
		phone2g.Internet();
		phone3g.videoCall();
	}

}
