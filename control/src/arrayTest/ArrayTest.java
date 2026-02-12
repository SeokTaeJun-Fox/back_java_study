package arrayTest;

import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
//      int[] arData = new int[5];
//      arData[0] = 10;
      
//      String[] arData2 = new String[3];
//      System.out.println(arData2[0]);
      
//      boolean[] arData3 = {false, false, true};
//      arData3[3] = false;
		
		int[] arData1 = {10, 3, 9, 6, 7};
//		System.out.println(arData1[0]);
//		System.out.println(arData1[1]);
//		System.out.println(arData1[2]);
//		System.out.println(arData1[3]);
//		System.out.println(arData1[4]);
		
		//.연산자 : 주소에 접근한느 연산자
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
		chars[0] = 97;
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
	}
}
