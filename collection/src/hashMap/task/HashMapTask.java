package hashMap.task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public class HashMapTask {
	public static void main(String[] args) {
		HashMap<String, Object> userData = new HashMap<String, Object>();
		
		userData.put("hobby1", "코딩");
		userData.put("hobby2", "잠자면서 코딩");
		userData.put("hobby3", "자기 전에 코딩");
		userData.put("hobby4", "밥먹으면서 코딩");
		userData.put("hobby5", "운동하면서 코딩");
		userData.put("hobby6", "하드 코딩");
		userData.put("hobby7", "바이브 코딩");
		userData.put("hobby8", "취중 코딩");
		userData.put("hobby9", "수면 코딩");
		userData.put("hobby10", "유중 코딩");
		
//      userData의 value 중 "운동" 또는 "수면" 또는 "유중"이 들어간 
//      key 이름을 모두 출력하시오
		
		PrintConditionValue print = (map) -> {
			Set<Entry<String, Object>> set = userData.entrySet();
			for(Entry<String, Object> entry : set) {
				String check = (String)entry.getValue();
				
				if(check.contains("운동") || check.contains("수면") || check.contains("유중")) {
					System.out.println(entry.getKey());
				}
			}
		};
		
		print = (map) -> {
			Iterator<Entry<String, Object>> iter = userData.entrySet().iterator();
			while(iter.hasNext()) {
				Entry<String, Object> entry = iter.next();
				String value = (String)entry.getValue();
				if(value.contains("운동") || value.contains("수면") || value.contains("유중")) {
					System.out.println(entry.getKey());
				}
			}
		};

//		print = (map) -> {
//			Set<Entry<String, Object>> set = userData.entrySet();
//			set.stream().filter(x -> ((String)x.getValue());
//			
//		};
		
		print.print(userData);
	}
}

//강사님 코드
//package hashMap.task;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map.Entry;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class HashMapTask {
//   public static void main(String[] args) {
//      HashMap<String, String> userData = new HashMap<String, String>();
//      Scanner sc = new Scanner(System.in);
//      String message = "찾고 싶은 글자를 입력하세요.\nex)유중|의미|코딩",
//            expression = null;
//      
//      userData.put("hobby1", "코딩");
//      userData.put("hobby2", "잠자면서 코딩");
//      userData.put("hobby3", "자기 전에 코딩");
//      userData.put("hobby4", "밥먹으면서 코딩");
//      userData.put("hobby5", "운동하면서 코딩");
//      userData.put("hobby6", "하드 코딩");
//      userData.put("hobby7", "바이브 코딩");
//      userData.put("hobby8", "취중 코딩");
//      userData.put("hobby9", "수면 코딩");
//      userData.put("hobby10", "유중 코딩");
//      
////      userData의 value 중 "운동" 또는 "수면" 또는 "유중"이 들어간 
////      key 이름을 모두 출력하시오 
//      
//      MyFilter myFilter = (findText, datas) -> {
//         Iterator<Entry<String, String>> iter = datas.entrySet().iterator();
//         
//         while(iter.hasNext()) {
//            
//            Entry<String, String> data = iter.next();
//            String key = data.getKey();
//            String value = data.getValue();
//
//            // "찾을글자1|찾을글자2|찾을글자3"
//            Pattern pattern = Pattern.compile(findText);
//            
//            if(pattern.matcher(value).find()) {
//               System.out.println(key);
//            }
//         }
//         
//      };
//      
//      System.out.println(message);
//      expression = sc.next();
//      myFilter.printFilterText(expression, userData);
//      
//   }
//}
