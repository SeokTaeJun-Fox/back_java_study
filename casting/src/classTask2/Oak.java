package classTask2;

public class Oak extends Monster {

	public Oak(int hp, String name) {
		super(hp, name);
	}
	
	@Override
	public void Damage(int amount) {
		System.out.println("오크가 달려든다!");
		
		super.Damage(amount);
		
		if (getHp() == 0) {
			dropItem();
		}
	}
	
	@Override
	protected void dropItem() {
		System.out.println("가죽 얻는다");
	}
}
