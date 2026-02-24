package interfaceTask1;

public class Student extends PersonActionAdapter{
	   public Student() {;}
	   public Student(String name, int age) {
	      super(name, age);
	   }
	   
	   @Override
	   public void eat() {
	      System.out.println("학생은 항상 배고프다.");
	   }
	   
	   @Override
	   public void goToSchool() {
	      System.out.println("등교한다");
	   }
	   
	}

