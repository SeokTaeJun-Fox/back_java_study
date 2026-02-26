package collectionTest;

public class ArrayTest {
	public static void main(String[] args) {
//		배열의 특징
//		1. 인덱스 (방번호)
//		2. 순서(시퀀스, iterable)가 있는 자료구조
//		3. 크기가 고정
		
	      int[] arData = new int[2];
	      int[] arTemp = new int[2];
	      
	      arData[0] = 10;
	      arData[1] = 20;
	      
//	      회원 가입
	      arTemp[0] = arData[0];
	      arTemp[1] = arData[1];
	      
	      arData = new int[3];
	      
	      arData[0] = arTemp[0];
	      arData[1] = arTemp[1];
	      arData[2] = 30;
	      
//	      회원 추가 
//	      회원 추가 
//	      회원 추가 
//	      회원 추가 
//	      회원 추가 
//	      회원 추가 
//	      회원 추가 
	}
}
