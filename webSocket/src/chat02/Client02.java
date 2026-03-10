package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
   public static void main(String[] args) {
//      ip, port
      String serverIp = "192.168.219.104";
//      학원 : "192.168.12.110"
//      집 : "192.168.219.104"
      int port = 1100;
      String clientMessage = null, serverMessage = null; 
      
      try(
            Socket socket = new Socket(serverIp, port);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc = new Scanner(System.in);
      ){
         
         System.out.println("서버가 연결되었습니다.");
         
         while(true) {
            System.out.println("서버로 메세지 보내기 >>");
            clientMessage = sc.nextLine();
            bufferedWriter.write(clientMessage + "\n");
            bufferedWriter.flush();
            System.out.println("[클라이언트]: " + clientMessage);
            
            serverMessage = bufferedReader.readLine();
            System.out.println("[서버]: " + serverMessage);
         }
         
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}








