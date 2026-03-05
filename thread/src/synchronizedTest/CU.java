package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread parent = new Thread(atm, "¾ö¸¶");
		Thread child = new Thread(atm, "»õ³¢");	
		
		parent.start();
		child.start();
	}
}
