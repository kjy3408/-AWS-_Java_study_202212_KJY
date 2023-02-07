package j25_소켓;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	
	public static void main(String[] args) {
		
		
		try {														//local host 127.0.0.1 (내 pc라는 뜻)
			Socket socket = new Socket("127.0.0.1", 9090);			//server가 아니라 클라이언트임. 서버 ip와 port번호 필요
			System.out.println("서버에 접속 성공!");
			
			InputStream inputStream = socket.getInputStream();		//server에서 output한걸 여기서 input으로 받음
			InputStreamReader streamReader = new InputStreamReader(inputStream); //BufferedReader를 쓰기위한 공식.(Inputstream -> InputStreamReader -> BufferedReader)
			BufferedReader reader = new BufferedReader(streamReader);
			
			System.out.println(reader.readLine());  				//한 줄 읽기(한 글자X)
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}					
		
		
	}
}
