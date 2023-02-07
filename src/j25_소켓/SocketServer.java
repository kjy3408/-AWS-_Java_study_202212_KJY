package j25_소켓;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer {

	public static final int PORT = 9090; 										//sersocket이 열릴려면 port번호가 있어야한다.
	
	public static void main(String[] args) {
		List<Socket> clients = new ArrayList<>();								//연결된 socket을 담기위한 list.
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);					//가장먼저 열려야할 것(port번호가 있어야한다)
			while(true) {														//무한루프해야 서버가 꺼지지않고 계속 돔.
				System.out.println("클라이언트의 접속을 기다리는 중입니다.");
				Socket socket = serverSocket.accept(); 							//클라이언트 접속을 기다리는 녀석.
				clients.add(socket);
				System.out.println("클라이언트가 연결되었습니다.");				//클라이언트 연결되면 실행됨.
				System.out.println(clients);
				OutputStream outputStream = socket.getOutputStream();			//getOutputStream의 리턴이 OutputStream객체
				PrintWriter out = new PrintWriter(outputStream, true);			//문자열을 보내줄 때 씀(버퍼기능까지 탑제함)
				out.println("___서버에 접속한 것을 환영합니다."); 				//server -> client로 보냄
			}
			
		} catch (IOException e) {												//IOException 꼭 있어야함
			
			e.printStackTrace();
		}					
		
	}
	
}
