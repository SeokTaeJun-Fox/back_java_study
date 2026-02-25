package lambdaTask3;

public class LambdaTask3 {
	
	int[] addArray(int[] input, int num) {
		int[] newInt = new int[input.length + 1];
		for(int i = 0; i < input.length; i++) {
			newInt[i] = input[i];
		}
		newInt[input.length] = num;
		return newInt;
	}
	
	public static void main(String[] args) {
	//  1. 전달한 글자가 등장하는 거리 구하기
	//  입력예시
	//  "abcdababefda", "a"
	//
	//  출력예시
	//  "3 -> 1 -> 4"
	//  만약 중복된 글자가 없어 거리를 찾지 못하면
	//  "-1"
		
		PrintDistances printDistances = (input, ch) -> {
			int[] distances = new int[0];
			int distance = 0, lastFind = -1;
			String print = "";
			LambdaTask3 lt3 = new LambdaTask3();
			
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) != ch) {
					if(lastFind != -1) {
						distance++;
					}
				} else if(input.charAt(i) == ch) {
					if(lastFind == -1) {
						lastFind = i;
					} else {
						distance = i-lastFind-1;
						lastFind = i;
						distances = lt3.addArray(distances, distance); //배열 추가
					}
				}
			}

			//출력
			for(int i = 0; i < distances.length; i++) {
				print += ("" +  distances[i]);
				if(i != distances.length - 1) {
					print += (" -> ");
				}
			}
			System.out.println(print);
		};
		
		printDistances.print("abcdabaabcdea", 'a');


	//  2. 스파이가 남긴 암호를 해독하시오.
	//  주어진 소문자(a~z) 범위라 가정한다.
	//  주어진 암호를 원래 문자열을 복원하시오.
	//
	//  "1051081111181011069711897"
	
	//해독방법 1 : a~z만 사용하는 26진수로 변환
	
		DecodeCode decodeCode = (code) -> {
			String output = "";
			int needCount = code.length() / 2;
			String target = "";
			for(int i = 0; i < needCount; i++) {
				target = "" + code.charAt(i);
				if(i != code.length()-1) {
					target += "" + code.charAt(i+1);
				}
				//System.out.println(target);
				output += (char)(97 + Integer.parseInt(target)%26);
			}
			return output;
		};
		
		System.out.println(decodeCode.decode("1051081111181011069711897"));
		
	}
}
