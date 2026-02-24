package abstractTest;

public abstract class Electronics {
	
//	상수: 값이 바뀌지 않는 값
	final int DATA_TEST = 10;
	
//	추상 메서드
	public abstract void on();
	public abstract void off();
	
//	일반 메서드
	public void safe() {
		System.out.println("안전 장치 발동!");
	}
}
