package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask2 {
   public static void main(String[] args) throws IOException{
      
      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
      
//      try ~ resource
//      try {} 문장이 모두 끝나면 사용한 resource를 자동으로 close해준다.
      try(
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt"));
         BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
      ){
         for(String food: foods) {
            bufferedWriter.write(food + "\n");
         }
      }
      
//      값을 수정, 값을 삭제
//      스테이크 -> 스파게티
      String line = null, temp = "";
      try(
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./food.txt"));
      ){
         while((line = bufferedReader.readLine()) != null) {
            if(line.equals("스테이크")) {
               temp += "스파게티\n";
               continue;
            }
            temp += line + "\n";
         }
      }
      
      try(
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt"));	//false, 기본값은 덮어쓰기
      ){
         bufferedWriter.write(temp);
      }
      
      //try{}끝나면 자동으로 flush가 된다.
   }
}










