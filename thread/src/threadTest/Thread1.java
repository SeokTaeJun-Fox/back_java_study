package threadTest;

public class Thread1 extends Thread {
	public String data;
	
	public Thread1() {;}
	public Thread1(String data) {
		super();
		this.data = data;
	}

//	코루틴?
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(data);
			
//			alt + shift + z
//			sleep쓰면 강제로 예외 처리 해야 한다.
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
