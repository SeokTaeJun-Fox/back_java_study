package classTask2;

public class Monster {
	
	private int hp;
	private String name;

	public Monster(int hp, String name) {
		this.hp = hp;
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp <= 0 ? 0 : hp;
	}
	
	public void Damage(int amount) {
		setHp(getHp() - amount);
		System.out.println("남은 데미지 : " + getHp());
	}
	
	protected void dropItem() {
		
	}
	
	
}
