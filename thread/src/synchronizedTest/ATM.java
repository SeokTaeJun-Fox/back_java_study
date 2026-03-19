package synchronizedTest;

public class ATM implements Runnable {
	int money = 10000;
	
	public void withdraw(int money) {
//		µ¿±â: synchronized(°´Ã¼){}
		synchronized (this) {
			System.out.println("µ· ºüÁü");
			this.money -= money;
		}
		
		System.out.println(Thread.currentThread().getName() + "ÀÌ(°¡)" + money + "¿ø Ãâ±İ");
		System.out.println("ÇöÀç ÀÜ¾×: " + this.money + "¿ø");
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
