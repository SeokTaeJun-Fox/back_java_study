package interfaceTask1;

public class Employee extends PersonActionAdapter{
	   public Employee() {;}
	   public Employee(String name, int age) {
	      super(name, age);
	   }
	   
	   @Override
	   public void eat() {
	      System.out.println("회사원은 굶는다");
	   }
	   
	   @Override
	   public void goToCompany() {
	      System.out.println("회사를 간다. 9 - 6");
	   }
	   
	   
	}
