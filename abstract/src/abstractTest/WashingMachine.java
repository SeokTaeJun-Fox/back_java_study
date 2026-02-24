package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("음성 인식으로 끔");
	}

	@Override
	public void off() {
		System.out.println("음성 인식으로 켬");
	}

}
