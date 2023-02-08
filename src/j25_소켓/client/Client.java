package j25_소켓.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9090);		//접속하고자 하는 ip와 port
						
			ClientRecive clientRecive = new ClientRecive(socket); //접속한 서버의 socket을 넣어줌.
			clientRecive.start();
			
			ClientSend clientSend = new ClientSend(socket);
			clientSend.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}					
		
	}
}
