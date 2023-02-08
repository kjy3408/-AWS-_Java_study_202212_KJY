package j25_소켓.multiSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static final int PORT = 9090; 
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);			
			System.out.println("서버를 실행합니다.");					
			
			while(true) {												//client접속을 받는 무한루프
				Socket socket = serverSocket.accept(); 					//client연결을 기다리는 녀석
			
				SocketServer socketServer = new SocketServer(socket);	//client가 연결이되면 소켓 객체를 하나 생성.
				socketServer.start();									//스레드 생성을 했으니 start해줘야함.
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("서버를 종료합니다.");
		}
		
		
		
		
	}
	
}
