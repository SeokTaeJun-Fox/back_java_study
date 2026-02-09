package castingTask;

public class CastingTask01 {
	public static void main(String[] args) {
//      6.37, 3.99, 3
      double num1 = 6.37, num2 = 3.99;
      int num3 = 3, numResult = 0;
      String result = "(int)(%.2f + %.2f) / %d = %d";
      
      numResult = (int)(num1 + num2) / num3;
      System.out.printf(result, num1, num2, num3, numResult);
	}
}
