package simplechatting2.server;

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

import com.google.gson.Gson;

import lombok.Data;
import simplechatting2.dto.JoinReqDto;
import simplechatting2.dto.JoinRespDto;
import simplechatting2.dto.MessageReqDto;
import simplechatting2.dto.MessageRespDto;
import simplechatting2.dto.RequestDto;
import simplechatting2.dto.ResponseDto;

@Data //socket이랑 username getter/setter
class ConnectedSocket extends Thread{
	public static List<ConnectedSocket> socketList = new ArrayList<>();
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private Gson gson;
	
	private String username;
	
	public ConnectedSocket(Socket socket) {
		this.socket = socket;
		gson = new Gson();
		socketList.add(this);
	}
	
	@Override
	public void run() {
		try {
			inputStream = socket.getInputStream(); 							//InputStream 생성.
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream)); 
			
			while(true) {
				String request = in.readLine();								//request => 요청 / requestDto가 JSON형식으로 들어올거임.
				RequestDto requestDto = gson.fromJson(request, RequestDto.class);		//모든 요청들은 requestDto로 들어감
				
				switch(requestDto.getResource()) {
					case "join" : 
						JoinReqDto joinReqDto = gson.fromJson(requestDto.getBody(), JoinReqDto.class);
						username = joinReqDto.getUsername();
						
						List<String> connectedUsers = new ArrayList<>();
						
						for(ConnectedSocket connectedSocket : socketList) {
							connectedUsers.add(connectedSocket.getUsername());
						}
						JoinRespDto joinRespDto = new JoinRespDto(username + "님이 접속하였습니다.", connectedUsers);
					
						System.out.println(joinRespDto);
						
						sendToAll(requestDto.getResource(), "ok", gson.toJson(joinRespDto));
						
						break; //join일때만 실행되기에 break;걸어줌.
					
					case "sendMessage" :
						MessageReqDto messageReqDto = gson.fromJson(requestDto.getBody(), MessageReqDto.class);
						
						if(messageReqDto.getToUser().equalsIgnoreCase("all")) {
							String message = messageReqDto.getFromUser() + "[전체]: " + messageReqDto.getMessageValue();
							MessageRespDto messageRespDto = new MessageRespDto(message);
							sendToAll(requestDto.getResource(), "ok", gson.toJson(messageRespDto));
						}else {
							String message = messageReqDto.getFromUser() + "[" + messageReqDto.getToUser() + "]: " + messageReqDto.getMessageValue();
							MessageRespDto messageRespDto = new MessageRespDto(message);
							sendToUser(requestDto.getResource(), "ok", gson.toJson(messageRespDto),messageReqDto.getToUser());
						}
						break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	private void sendToAll(String resource, String status, String body) throws IOException { //모든 소켓에게 responseDto 전달하기 위한 메소드
		ResponseDto responseDto = new ResponseDto(resource, status, body);
		for(ConnectedSocket connectedSocket : socketList) {	//모든 소켓에 날려주는거임. socketList를 static으로 선언한 이유
			OutputStream outputStream = connectedSocket.getSocket().getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);
			
			out.println(gson.toJson(responseDto));
		}
	}
	
	private void sendToUser(String resource, String status, String body, String toUser) throws IOException {
		ResponseDto responseDto = new ResponseDto(resource, status, body);
		for(ConnectedSocket connectdSocket : socketList) {
			if(connectdSocket.getUsername().equals(toUser) || connectdSocket.getUsername().equals(username)) {//찾은 이름이 소켓안에 있다면! 메세지 보냄(귓속말)
				OutputStream outputStream = connectdSocket.getSocket().getOutputStream();
				PrintWriter out = new PrintWriter(outputStream, true);
				
				out.println(gson.toJson(responseDto));				
			}
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
