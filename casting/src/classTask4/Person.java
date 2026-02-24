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

//public class MarketCustomer {
////  이름, 전화번호, 돈, 포인트, 쿠폰
//  private String customerName;
//  private String customerPhone;
//  private int customerMoney;
//  private int customerPoint;
//  private int customerCoupon;
//  
//  public MarketCustomer() {;}
//  public MarketCustomer(String customerName, String customerPhone, int customerMoney) {
//     this.customerName = customerName;
//     this.customerPhone = customerPhone;
//     this.customerMoney = customerMoney;
//  }
//  public String getCustomerName() {
//     return customerName;
//  }
//  public void setCustomerName(String customerName) {
//     this.customerName = customerName;
//  }
//  public String getCustomerPhone() {
//     return customerPhone;
//  }
//  public void setCustomerPhone(String customerPhone) {
//     this.customerPhone = customerPhone;
//  }
//  public int getCustomerMoney() {
//     return customerMoney;
//  }
//  public void setCustomerMoney(int customerMoney) {
//     this.customerMoney = customerMoney;
//  }
//  public int getCustomerPoint() {
//     return customerPoint;
//  }
//  public void setCustomerPoint(int customerPoint) {
//     this.customerPoint = customerPoint;
//  }
//  public int getCustomerCoupon() {
//     return customerCoupon;
//  }
//  public void setCustomerCoupon(int customerCoupon) {
//     this.customerCoupon = customerCoupon;
//  }
//  
//  public void printInfo() {
//     System.out.println(this.getCustomerName() + "\n돈: " + this.getCustomerMoney() + "\n포인트: " + this.getCustomerPoint() + "\n쿠폰: " + this.getCustomerCoupon());
//  }
//  
//}
