package castingTask;

public class CastingTask03 {
	public static void main(String[] args) {
//      'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
		char beforeChar1 = 'a', beforeChar2 = 'j', beforeChar3 = 'k',
				afterChar1 = ' ', afterChar2 = ' ', afterChar3 = ' ';
		
		int moveAmount = 32;
		String resultFormat = "\'a\' => %c, \'j\' => %c, \'k\' => %c";
		//char test = 'a' + 32;
	
		afterChar1 = (char)(beforeChar1 - moveAmount);
		afterChar2 = (char)(beforeChar2 - moveAmount);
		afterChar3 = (char)(beforeChar3 - moveAmount);

		System.out.printf(resultFormat, afterChar1, afterChar2, afterChar3);
	}
}
