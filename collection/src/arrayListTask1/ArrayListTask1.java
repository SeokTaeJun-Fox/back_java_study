package arrayListTask1;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			datas.add((i + 1) * 10);
		}
		
//		System.out.println(datas);
		
//		실습
//		50뒤에 500을 삽입
		
//		for(int i = 0; i < datas.size(); i++) {
//			if(datas.get(i).equals(50)) {
//				datas.set(i, 50500);
//			}
//		}
//		System.out.println(datas);
		
		if(datas.contains(50)) {
			int findFiftyIndex = datas.indexOf(50);
			datas.add(findFiftyIndex + 1, 500);
		}
		
//		80 삭제
//		1. 인덱스로 삭제하기
		
//		for(int i = 0; i < datas.size(); i++) {
//			if(datas.get(i) == 80) {
//				datas.remove(i);
//			}
//		}
		
		if(datas.contains(80)) {
			int findEightyIndex = datas.indexOf(80);
			datas.remove(findEightyIndex);
		}
	
		//		60 삭제
		//		2. 값으로 삭제하기
	try {
			if(datas.contains(60)) {
	//			Wrapper Class
				datas.remove(Integer.valueOf(60));
			}
			
			System.out.println(datas);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
