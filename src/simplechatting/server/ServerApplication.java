package simplechatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerApplication {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("========<< 서버 실행 >>========");
			
			Socket socket = serverSocket.accept();										//client의 접속을 기다리는 녀석
			System.out.println(socket.getInetAddress() + "클라이언트가 연결되었습니다."); //연결 시 뜨는 메시지
			OutputStream outputStream = socket.getOutputStream(); 						//client한테 전송하기위해 outstream생성
			PrintWriter out = new PrintWriter(outputStream, true); 						//얘가 있어야 client한테 전송가능
			out.println("join"); 														//join 이라고 전송한다.
			
			InputStream inputstream = socket.getInputStream(); 							//InputStream 생성.
			BufferedReader in= new BufferedReader(new InputStreamReader(inputstream)); 
			
			String welcomeMessage = in.readLine();										//client에서 입력한 outprint을 받아옴.
			System.out.println(welcomeMessage); 										//그냥 서버에 띄우기위한 메세지
			out.println(welcomeMessage);												//client에 돌려주기위한 out메시지
			
			while(true) {
				in.readLine();															//.계속 기다림. 서버종료 안되는 역할임 일단은..
			}
			
		} catch (SocketException e) {
			e.printStackTrace();
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
