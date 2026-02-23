package classTask4;

public class Person {
	private String name;
	private String phoneNumber;
	private int money;
	private int point;
	private int coupon;
	
	public Person(String name, String phoneNumber, int money, int point, int coupon) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
	public void savePoint(int amount) {
		point += amount;
	}
	
	public void print() {
		System.out.printf("이름 : %s, 전화번호 : %s, 남은돈 : %d, 포인트 : %d, 쿠폰 : %d\n", name, phoneNumber, money, point, coupon);
	}
}
