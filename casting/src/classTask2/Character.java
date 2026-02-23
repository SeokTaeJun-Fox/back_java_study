package classTask2;

public class Character {
	
	private int atk;
	
	public Character(int atk) {
		this.atk = atk;
	}
	
	public void hunt(Monster target) {
		target.Damage(atk);
	}
}
