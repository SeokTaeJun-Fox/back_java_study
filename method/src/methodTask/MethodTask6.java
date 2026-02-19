package methodTask;

public class MethodTask6 {
	
	   String convertNumber(int number) {
		      String result = "";
		      
		      if(number < 1 || number > 1000000) {
		         return "입력값 범위 초과";
		      }
		      
		      int man = 0, thousand = 0, hundred = 0, ten = 0, one = 0;
		      
		      man = number / 10000;
		      thousand = (number % 10000) / 1000;
		      hundred = (number % 1000) / 100;
		      ten = (number % 100) / 10;
		      one = number % 10;
		      
		      if(man > 0) {
		         result += man + "만";
		      }

		      if(thousand > 0) {
		         result += thousand + "천";
		      }
		      
		      if(hundred > 0) {
		         result += hundred + "백";
		      }
		      
		      if(ten > 0) {
		         result += ten + "십";
		      }
		      
		      if(one > 0) {
		         result += one;
		      }
		      
		      return result;
		   }
	
	public static void main(String[] args) {
//      사용자의 입력값은 1 ~ 1000000까지 입력
//      마스터 2.
//      정수를 한글 단위 숫자로 변환하시오
//      입력 예시1)
//      1000000
//      출력 예시1)
//      1백만
      
//      입력 예시2)
//      173200
//      출력 예시
//      17만3천2백
	      MethodTask6 mt = new MethodTask6();
	      System.out.println(mt.convertNumber(973210));
		
	}
}
