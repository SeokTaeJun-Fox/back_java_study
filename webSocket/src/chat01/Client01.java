package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
//		ip, port
		String serverIp = "192.168.12.110";
//		192.168.5.254
		int port = 1100;
		Scanner sc = new Scanner(System.in);
		
		try(
				Socket socket = new Socket(serverIp, port);	//객체화 되자마자 연결됨
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
		){
			System.out.println("서버가 연결되었습니다.");
			
			String message = sc.nextLine();//"안녕? 나는 클라이언트!";
			
			writer.println(message);
			System.out.println("서버로 [" + message + "]를 전송 하였습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
