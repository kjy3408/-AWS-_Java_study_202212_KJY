package simplechatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.ByteString.Output;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import lombok.Data;

@Data //socket이랑 username getter/setter
class ConnectedSocket extends Thread{
	public static List<ConnectedSocket> socketList = new ArrayList<>();
	
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private String username;
	
	public ConnectedSocket(Socket socket) {
		this.socket = socket;
		socketList.add(this);
	}
	
	@Override
	public void run() {
		try {
			outputStream = socket.getOutputStream(); 						//client한테 전송하기위해 outstream생성
			PrintWriter out = new PrintWriter(outputStream, true); 						//얘가 있어야 client한테 전송가능
			out.println("join"); 														//join 이라고 전송한다.
			
			inputStream = socket.getInputStream(); 							//InputStream 생성.
			BufferedReader in= new BufferedReader(new InputStreamReader(inputStream)); 
			
			username = in.readLine();												//client에서 입력한 outprint을 받아옴.
			System.out.println(username + "님이 접속하였습니다.");						//서버에 출력하기 위한 print 	
				
			String userListStr = "";
			
			for(int i = 0; i < socketList.size(); i++) {
				userListStr += socketList.get(i).getUsername();
				if(i < socketList.size() - 1) {
					userListStr += ",";
				}
			}
			
			for(ConnectedSocket connectedSocket : socketList) {												//모든 소켓에게 다 뿌려줌
				outputStream = connectedSocket.getSocket().getOutputStream();								//모든 소켓에게 다 뿌려줌
				out = new PrintWriter(outputStream, true);
				out.println("@welcome/" + username + "님이 접속하였습니다.");
				out.println("@userList/" + userListStr);
			}
			
			while(true) {
					String message = in.readLine();
					for(ConnectedSocket connectedSocket : socketList) {											//모든 소켓에게 다 뿌려줌
						outputStream = connectedSocket.getSocket().getOutputStream();							//모든 소켓에게 다 뿌려줌
						out = new PrintWriter(outputStream, true);
						out.println(message);
					}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}	



public class ServerApplication {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9090);										//서버연결=====================
			System.out.println("========<< 서버 실행 >>========");
						
			while(true) {
				Socket socket = serverSocket.accept();									
				ConnectedSocket connectedSocket = new ConnectedSocket(socket);			//스레드
				connectedSocket.start();						
			}
		
		}catch (IOException e) {
			e.printStackTrace();
			
		} finally { //try안에 지역변수로 있으면 finally에서 못씀
						
			if(serverSocket != null) {
				try {
					serverSocket.close();
										
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			
			System.out.println("========<< 서버 종료 >>========");
		}
	
	}// 
}//
