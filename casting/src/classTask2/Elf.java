package classTask2;

public class Elf extends Monster {
	
	public Elf(int hp, String name) {
		super(hp, name);
	}
	
	@Override
	public void Damage(int amount) {
		System.out.println("요정이 마법을 사용한다");
		
		super.Damage(amount);
		
		if (getHp() == 0) {
			dropItem();
		}
	}
	
	@Override
	protected void dropItem() {
		System.out.println("날개를 얻는다");
	}
}

//강사님 코드
//public class Fairy extends Monster {
//	   public Fairy() {;}
//	   
//	   @Override
//	   public void dropItem() {
//	      System.out.println("날개를 떨군다.");
//	   }
//	   
//	   public void magicAttact() {
//	      System.out.println("마법으로 공격한다.");
//	   }
//	}

