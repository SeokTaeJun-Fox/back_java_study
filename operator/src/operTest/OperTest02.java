package operTest;

public class OperTest02 {
	public static void main(String[] args) {
	      String data1 = "a", data2 = "a", data3 = "a";
	      String data4 = new String("a"), data5 = new String("a");
	      
//	      ※ 문자열끼리 ==(주소를 비교하는 연산자)를 사용하면 안된다.
//	      "".equals()
	      System.out.println(data1);
	      System.out.println(data1 == data2);
	      System.out.println(data4);
	      System.out.println(data1 == data4);
	      System.out.println(data5);
	      System.out.println(data4 == data5);
	      System.out.println(data4.equals(data5));
	}
}
