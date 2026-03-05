package synchronizedTest;

public class ATM implements Runnable {
	int money = 10000;
	
	public void withdraw(int money) {
//		동기: synchronized(객체){}
		synchronized (this) {
			System.out.println("캮");
			this.money -= money;
		}
		
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액: " + this.money + "원");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			withdraw(1000);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
