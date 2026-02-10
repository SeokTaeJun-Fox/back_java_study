package operTask;

import java.util.Scanner;

public class OperTask {
	public static void main(String[] args) {
	      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
	      // 총점과 평균을 구한다.
	      // 성적이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
	      // 단 if문을 사용하지 않는다.
	      // 평균은 소수점 2번째 자리까지만 표기한다.
		
		Scanner sc = new Scanner(System.in);
		
		int math = 0, english = 0, korean = 0, total = 0;
		double average = 0;
		String message = null, format = null;
		
		System.out.println("국어, 수학, 영어를 입력하세요: ex)10 20 30");
		
		format = "국어 : %d, 수학 : %d, 영어 : %d, 총점 : %d, 평균 : %.2f이므로 %s입니다.";
		
		math = sc.nextInt();
		english = sc.nextInt();
		korean = sc.nextInt();
		 
		total = math+english+korean;
		average = total/3.0;
		message = average > 60 ? "합격" : average < 60 ? "불합격" : "재평가";
		
		System.out.printf(format, korean, math, english, total, average, message);
	}
}
