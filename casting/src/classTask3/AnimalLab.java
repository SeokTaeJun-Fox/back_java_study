package classTask3;

public class AnimalLab {
	public void checkAnimal(Animal target) {
		
		target.enter();
		
		if (target instanceof Harbivore) {
			System.out.println(target.getName() + "은(는) 초식 동물 입니다.");
		} else if(target instanceof Carnivore) {
			System.out.println(target.getName() + "은(는) 육식 동물 입니다."); 
		} else if(target instanceof Omivore) {
			System.out.println(target.getName() + "은(는) 잡식 동물 입니다.");
		}
	}
}

//강사님 코드
//package classTask3;
//
//public class AnimalLab {
//   private String name;
//   
//   public AnimalLab() {;}
//   public AnimalLab(String name) {
//      this.name = name;
//   }
//
//   public String getName() {
//      return name;
//   }
//   public void setName(String name) {
//      this.name = name;
//   }
//   
//   public void checkAnimal(Animal animal){
//      if(animal instanceof Carnivore) {
//         Carnivore carnivore = (Carnivore)animal;
//         carnivore.printCarnivore();
//         
//         if(animal instanceof Lion) {
//            Lion lion = (Lion)animal;
//            lion.speak();
//         }else {
//            Bear bear = (Bear)animal;
//            bear.speak();
//         }
//         
//      }else if(animal instanceof Harbivore) {
//         Harbivore harbivore = (Harbivore)animal;
//         harbivore.printHarbivore();
//         
//         if(animal instanceof Koala) {
//            Koala koala = (Koala)animal;
//            koala.speak();
//         }else {
//            Deer deer = (Deer)animal;
//            deer.speak();
//         }
//         
//      }else if(animal instanceof Omivore) {
//         Omivore omivore = (Omivore)animal;
//         omivore.printOmivore();
//         
//         if(animal instanceof Dog) {
//            Dog dog = (Dog)animal;
//            dog.speak();
//         }else {
//            Cat cat = (Cat)animal;
//            cat.speak();
//         }
//         
//         
//      }else {
//         System.out.println("모르는 동물!");
//      }
//   }
//}
