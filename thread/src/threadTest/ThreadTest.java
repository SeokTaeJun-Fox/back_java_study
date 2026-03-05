package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread_1 = new Thread1("?");
//		Thread1 thread_2 = new Thread1("!");
		
		//단일쓰레드 (main쓰레드 일꾼 한명이 위에서 아래로 실행하기 때문에) - run
//		start로 실행하면 됨
//		thread_1.start();
//		thread_2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "★");
		Thread thread2 = new Thread(target2, "*");
		
		thread1.start();
		thread2.start();
		
//		누구를 먼저 처리할지 확률을 올린다 (반드시는 아님) 우선순위1을 반드시 먼저실행하지 않는다.
//		thread1.setPriority(1);
//		thread1.setPriority(10);
		
		try {
//			join은 try catch강제한다
//			join은 main쓰레드가 기다리게 한다.
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
//		메인쓰레드와 다른쓰레이와 우선순위는 같다.
		System.out.println("메인쓰레드");
	}
}
