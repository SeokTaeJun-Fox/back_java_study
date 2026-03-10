package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		new FileWriter(경로(+파일), 이어쓰기 여부)
//		BufferedWriter bufferedWriter = null;
//		try {
//			bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));	//버퍼를 통해서 작성한다. (웬만해서 true로해야된다)
//			bufferedWriter.write("오늘 점심 메뉴 리스트\n");	//버퍼에다가 작성함 (파일에다가 작성하지 않음)
//			bufferedWriter.write("김치찌개\n");	
//			bufferedWriter.write("라면\n");	
//			bufferedWriter.write("햄버거\n");	
//			bufferedWriter.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
//		파일 읽기
		BufferedReader bufferedReader = null;
		
		
		try {
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));
//			String line = null;			
//		while문으로 모든 내용 읽기
//		while((line = bufferedReader.readLine())!= null) {
//			System.out.println(line);
//		}
			bufferedReader.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bufferedReader != null)
				bufferedReader.close();
		}
		
	}
}
