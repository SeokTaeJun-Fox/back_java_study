package castingTask;

public class CastingTask04 {
	public static void main(String[] args) {
//      (심화)      
//      "0.12346", "0.5130", "78", "9.133";
//     4개 값을 더해서 123456789를 출력하기
		
//		0.12346에 1234추출
//		0.5130에 5추출
//		9.133을 형변환에 9를 만들고 78%9에 6추출
//		num3에 78추출
//		num4에 9추출
		
		String num1 = "0.12346", num2 = "0.5130", num3 = "78", num4 = "9.133", result = null, format = "%s\n", oneToFour = "";
		int five, six = 0, nine = 0, fiveSix = 0;
		
		oneToFour = String.valueOf((int)(Double.parseDouble(num1)*10000));
		five = (int)(Double.parseDouble(num2)*10);
		six = Integer.parseInt(num3)%(int)(Double.parseDouble(num4));
		nine = (int)(Double.parseDouble(num4));
		
		result = oneToFour + five + six + num3 + nine; //"1234" + 5 + 6 + "78" + 9
		
		System.out.printf(format, result);
		
//		0.12346에 1234추출
//		0.5130 > 0.5130*100 > int형변환, 0.5130 > 5.13 > int형변환하여 각각 합하여 56추출
//		num3에 78추출
//		num4에 9추출	
		
		fiveSix = (int)((Double.parseDouble(num2)*100)+(Double.parseDouble(num2)*10));
		
		result = oneToFour + fiveSix + num3 + nine;	//"1234" + 56 + "78" + 9
		
		System.out.printf(format, result);
		
		
	}
}
