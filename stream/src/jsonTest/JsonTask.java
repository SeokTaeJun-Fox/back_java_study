package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTask {
	public static void main(String[] args) {
	//  "/news", "/game", "/brand", "/rank"
	//  위 4개 경로를 모두 ArrayList에 추가하고,
	//  경로 앞에 "/app"을 붙인 뒤
	//  JSONArray로 변경하기
		
		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		JSONArray jsonArray = new JSONArray();
		
		strings
			.stream()
			.map(x -> "/app" + x)
//			.map(x -> new JSONObject(x))
			.forEach(jsonArray::put);
		
		//System.out.println(jsonArray);

	}
}
