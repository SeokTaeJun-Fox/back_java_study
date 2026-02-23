package classTask3;

public class Omivore extends Animal {
	public Omivore(String name) {
		super(name);
	}
	
	@Override
	public void enter() {
		System.out.println("잡식 동물 입장");
	}
}
