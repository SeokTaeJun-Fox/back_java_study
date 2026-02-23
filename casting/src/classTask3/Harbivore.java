package classTask3;

public class Harbivore extends Animal {
	public Harbivore(String name) {
		super(name);
	}
	
	@Override
	public void enter() {
		System.out.println("초식 동물 입장");
	}
}
