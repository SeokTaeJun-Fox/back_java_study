package variableTesk;

public class VariableTask01 {
	public static void main(String[] args) {
//      각 데이터에 맞는 타입 선언 후 출력하기
//      5, false, 7845.12, B, 자바, 107L
//      int, boolean, double, char, String, long
      int num1 = 0;
      boolean data1 = false;
      double num2 = 0.0;
      char data2 = ' ';
      String data3 = null;
      long num3 = 0L;
      
      num1 = 5;
      data1 = false;
      num2 = 7845.12;
      data2 = 'B';
      data3 = "자바";
      num3 = 107L;
      
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num3);
      System.out.println(data1);
      System.out.println(data2);
      System.out.println(data3);
	}
}
