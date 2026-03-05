package chatting;

import java.io.BufferedReader;
import java.io.IOException;

// 서버로 부터 받은 메세지를 무한으로 클라이언트 콘솔에 출력
public class ClientThread implements Runnable {
	
	private BufferedReader input;
	
	public ClientThread() {;}
	public ClientThread(BufferedReader input) {
		this.input = input;
	}


	@Override
	public void run() {
		String line = null;

		try {
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
