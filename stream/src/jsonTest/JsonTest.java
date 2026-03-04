package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

import streamTask.User;

public class JsonTest {
	public static void main(String[] args) {
		   ArrayList<User> users = new ArrayList<User>(
			         Arrays.asList(
			            new User(1L, "홍길동", 20, "개발자", "남"),
			            new User(2L, "장보고", 30, "기획자", "남"),
			            new User(3L, "이순신", 35, "사장", "남")
			         )
			      );
		   
//		   Class -> JSON
		   JSONObject userJSON = new JSONObject();
		   JSONArray usersJSON = new JSONArray();
		   
//		   생성자를 통해 생성한다.
//		   System.out.println(new JSONObject(new User(1L, "홍길동", 20, "개발자", "남")));
		   
//		   new usersJSON(users) 안됨
//		   class -> JSONObject -> JSONArray에 추가
		   
		   users
			   .stream()
			   .map(JSONObject::new)
			   .forEach(usersJSON::put);
		   
		   System.out.println(usersJSON);
	}
}
