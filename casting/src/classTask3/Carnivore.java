package classTask3;

public class Carnivore extends Animal {
	public Carnivore(String name) {
		super(name);
	}
	
	@Override
	public void enter() {
		System.out.println("육식 동물 입장");
	}
}

//강사님 코드
//package classTask3;
//
//public class Bear extends Carnivore{
//   
//   public Bear() {;}
//   public Bear(String name, int age, String feed) {
//      super(name, age, feed);
//   }
//   
//   @Override
//   public void speak() {
//      System.out.println("크앙~");
//   }
//}

