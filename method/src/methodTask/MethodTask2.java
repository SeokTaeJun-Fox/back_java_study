package methodTask;

public class MethodTask2 {
//	배열 응용
	
	void checkChar(char ch) {
		if(ch >= 65 && ch <= 90) {
			System.out.printf("%c는 대문자 입니다.", ch);
		} else if (ch >= 97 && ch <= 122) {
			System.out.printf("%c는 소문자 입니다.", ch);
		} else {
			System.out.printf("%c는 일반문자 입니다.", ch);
		}
	}
	
	double operation(int num1, int num2, char op) {
		switch(op) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return (double)num1 / num2;			
		}
		
		return 0;
	}
	
	void FindMaxMin(int num1, int num2, int num3, int num4, int num5) {
		int min = num1;
		int max = num1;
		
		if(min > num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		if(min > num4) {
			min = num4;
		}
		if(min > num5) {
			min = num5;
		}
		
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		if(max < num5) {
			max = num5;
		}
		
		System.out.printf("최댓값: %d, 최솟값: %d", max, min);
	}
	
	public static void main(String[] args) {
		
		MethodTask2 mt = new MethodTask2();
		
//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
		mt.checkChar('z');
		
//      2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
		System.out.println(mt.operation(3, 5, '/'));
		
//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
		mt.FindMaxMin(3, 2, 4, 1, 2);
	}
}
