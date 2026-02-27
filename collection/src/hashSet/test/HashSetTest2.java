package hashSet.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ESTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ESTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		mbtiType.add("INFJ");
		mbtiType.add("ESFP");
		mbtiType.add("ENFJ");
		mbtiType.add("ENTJ");
		mbtiType.add("ISTP");
		
		System.out.println(mbtiType);

//		문법 or iterator
//		for(String mbti: mbtiType) {
//			System.out.println(mbti);
//		}
		
//		순서가 없을 때 순서를 붙여주는 인터페이스
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
//			System.out.println(iter.next());
			
			if(mbti.equals("ESTJ")) {
				System.out.println(mbti);
			}
		}
		
//		중복된 데이터 삭제
	      ArrayList<Integer> datas =new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 20, 30, 40));
	      datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
	      System.out.println(datas);
	}
}
