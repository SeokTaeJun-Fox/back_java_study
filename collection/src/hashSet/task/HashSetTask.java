package hashSet.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTask {
	public static void main(String[] args) {
//      "banana", "apple", "orange", "apple", "banana"
//      문자열 ArrayList가 존재할 때 중복이 되지 않는 글자만 연결하여 출력하기
//      ex) 출력 결과: banpleorng

	      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("banana", "apple", "orange", "apple", "banana"));
	      
//	      풀이1
//	      HashSet<String> hashDatas = new HashSet<String>(datas);
//	      HashSet<Character> charHashDatas = new HashSet<Character>();
//	      
//	      System.out.println(hashDatas);
//	      Iterator<String> iter = hashDatas.iterator();
//	      
//	      while(iter.hasNext()) {
//	    	  String str = iter.next();
//	    	  for(int i = 0; i < str.length(); i++) {
//	    		  charHashDatas.add(str.charAt(i));
//	    	  }
//	      }
//	      
//	      String result = "";
//	      Iterator<Character> iterChar = charHashDatas.iterator();
//	      while(iterChar.hasNext()) {
//	    	  result += iterChar.next();
//	      }
//	      
//	      System.out.println(result);
	      
//	      풀이2
//	      HashSet<Character> hashCharDatas = new HashSet<Character>();
//	      for(String str : datas) {
//	    	  for(int i = 0; i < str.length(); i++) {
//	    		  hashCharDatas.add(str.charAt(i));
//	    	  }
//	      }
//	      
//	      String result = "";
//	      for(Character ch : hashCharDatas) {
//	    	  result += ch;
//	      }
//	      
//	      System.out.println(result);
	      
//	      풀이3 (람다식)
	      Dedupe dedupe = (expression) -> {
	          HashSet<String> dedupeHashSet = new HashSet<String>(expression);
	          HashSet<Character> charHashSet = new HashSet<Character>();
	          String result = "";
	          
	          for(String str: dedupeHashSet) {
	             for(char c: str.toCharArray()) {
	                charHashSet.add(c);
	             }
	          }
	          
	          for(char c: charHashSet) {
	             result += c;
	          }
	          
	          return result;
	       };
	       
	       
	       String result = dedupe.dedupe(datas);
	       System.out.println(result);
	}
}
