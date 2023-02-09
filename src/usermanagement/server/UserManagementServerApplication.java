package usermanagement.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class UserManagementServerApplication implements Runnable{
	
	private final static int PORT = 9090;
	private ServerSocket serverSocket; 
	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("===========<< 서버 실행 >>===========");
			
			socketConection();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				
				System.out.println("===========<< 서버 종료 >>===========");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void socketConection() throws IOException {
		while(true) {
			Socket socket = serverSocket.accept();						//방금 접속한 client를 아래의 SocketServer로 전달
			SocketServer socketServer = new SocketServer(socket);
			socketServer.start();
		}
	}
	
	public static void main(String[] args) {
		
		UserManagementServerApplication application = new UserManagementServerApplication();
		application.run();
		
		
	}
	
}
