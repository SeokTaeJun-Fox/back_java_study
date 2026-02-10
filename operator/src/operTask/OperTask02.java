package operTask;

import java.util.Scanner;

public class OperTask02 {
	public static void main(String[] args) {
//      삼항 연산자
//      각각 사용자에게 동물을 입력 받고,
//      해당 동물에 해당되는 메세지를 출력하세요.
//      운명의 동물 찾기
//      사용자가 입력한 값에 따라 다른 결과를 출력하시오.
//      1. 고양이
//      고양이를 좋아하는 당신은 대훈이의 러버입니다.
      
//      2. 소
//      소를 좋아하는 당신은 세종이의 단짝입니다.
      
//      3. 강아지
//      강아지를 좋아하는 당신은 민균이의 짝사랑입니다.
      
//      4. 고라니
//      고라니를 좋아하는 당신은 미쳤습니다.
		
		Scanner sc = new Scanner(System.in);
		
		String cat = null, cow = null, dog = null, gorani = null,
				catAnswer = null, cowAnswer = null, dogAnswer = null, goraniAnswer = null, otherAnswer = null,
					answer = null, input = null;
		cat = "고양이";
		cow = "소";
		dog = "강아지";
		gorani = "고라니";
		
		catAnswer = "고양이를 좋아하는 당신은 대훈이의 러버입니다.";
		cowAnswer = "소를 좋아하는 당신은 세종이의 단짝입니다.";
		dogAnswer = "강아지를 좋아하는 당신은 민균이의 짝사랑입니다.";
		goraniAnswer = "고라니를 좋아하는 당신은 미쳤습니다.";
		
		otherAnswer = "당신이 선택한 동물은 외계인이므로 지구밖으로 나가십시오. 추방 명령입니다.";
		
		System.out.println("좋아하는 동물을 입력하세요 (고양이, 소, 강아지, 고라니):");
		input = sc.next();
		
		answer = input.equals(cat) ? catAnswer 
				: input.equals(cow) ? cowAnswer 
					: input.equals(dog) ? dogAnswer 
						: input.equals(gorani) ? goraniAnswer 
							: otherAnswer;
		
		System.out.println(answer);
	}
}
