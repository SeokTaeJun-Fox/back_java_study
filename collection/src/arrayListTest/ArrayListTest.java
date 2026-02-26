package arrayListTest;

import java.util.ArrayList;

public class ArrayListTest<T> {
//	<?>: 제네릭 - 포괄적인 즉 이름이 없는이라는 뜻
//	지금 당장 무슨 타입일 지 알 수 없을 때 사용한다.
//	또한 사용자가 어떤 타입의 데이터를 넣을 지 모르기 때문에
//	객체화를 시킬 때 정해주다.
	T data;
	
	public static void main(String[] args) {

		ArrayList<String> datas = new ArrayList();
		
//		CRUD
//		C: Create(추가)
//		R: Read(읽기) == Get
//		U: Update(수정)
//		D: Delete(삭제)
		
		datas.add("이규학");
		datas.add("약소훈");
		datas.add("썬윤성");
		datas.add("Yes규호");
		datas.add("유중의미");
		System.out.println(datas);
		System.out.println(datas.get(3));
		
//		Yes규호
		String prev = datas.set(3, "No규호");
		System.out.println(datas);
		
		String removed = datas.remove(0);
		System.out.println(removed);
		System.out.println(datas);
	}
}
