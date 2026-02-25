package lambdaTask;

public class LamdaTask1 {
	public static void main(String[] args) {
//      1~10까지 출력해주는 메서드
//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드 
		
		PrintNumber printNumber = () -> {
			for(int i = 0 ; i < 10; i++) {
				System.out.println(i+1);
			}
		};
		
		ReplaceString replaceString = (input, to, index) -> {
			String newString = "";
			for(int i = 0; i < input.length(); i++) {
				if(i == index) {
					newString += to;
				} else {
					newString += input.charAt(i);
				}
			}
			
			return newString;
		};
		
		printNumber.print();
		
		ReplaceString a = replaceString;
		
		System.out.println(replaceString.replaceString("abcdefgh", 'e', 2));
	}
}
