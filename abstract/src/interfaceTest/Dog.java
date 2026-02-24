package interfaceTest;

public class Dog implements Pet {

	@Override
	public void sitDown() {
		System.out.println("¾É¾Æ");
	}

	@Override
	public void waitNow() {
		System.out.println("±â´Ù·Á");
	}

	@Override
	public void poop() {
		System.out.println("¹èº¯ ÈÆ·Ã");
	}

}
