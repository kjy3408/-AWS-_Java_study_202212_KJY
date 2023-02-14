package simplechatting2.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import lombok.Getter;
import simplechatting2.dto.JoinReqDto;
import simplechatting2.dto.MessageReqDto;
import simplechatting2.dto.RequestDto;

@Getter
public class ChattingClient extends JFrame {
	private static ChattingClient instance = null;
	
	public static ChattingClient getInstance() {
		if(instance == null) {
			instance = new ChattingClient();
		}
		return instance;
	}
	
	private Socket socket;
	private Gson gson;
	private String username;
	
	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;
	private JTextField messageInput;
	private JList<String> userList;
	private DefaultListModel<String> userListModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = ChattingClient.getInstance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ChattingClient() {
		gson = new Gson();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		ipInput = new JTextField();
		ipInput.setText("127.0.0.1"); //미리작성해놈
		ipInput.setBounds(309, 10, 85, 44);
		contentPane.add(ipInput);
		ipInput.setColumns(10);
		
		
		JButton connectButton = new JButton("연결"); //변수 전역으로 뺌
		connectButton.addMouseListener(new MouseAdapter() {				
			
			@Override
			public void mouseClicked(MouseEvent e) {			
				try {
					alreadyCon();
					connectButton.setEnabled(false);
					connectButton.removeMouseListener(this);
				}catch (ConnectException e1) {
					
					JOptionPane.showMessageDialog(null,  
							"서버 접속 실패", 
							"접속실패", 
							JOptionPane.ERROR_MESSAGE);
					
				} catch (UnknownHostException e1) {
					e1.printStackTrace();					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		connectButton.setBounds(458, 20, 69, 23);
		contentPane.add(connectButton);
		
		
		portInput = new JTextField();
		portInput.setText("9090"); //미리작성해놈
		portInput.setBounds(395, 10, 51, 44);
		contentPane.add(portInput);
		portInput.setColumns(10);
		
		JScrollPane contentScoll = new JScrollPane();
		contentScoll.setBounds(12, 10, 275, 399);
		contentPane.add(contentScoll);
	
		contentView = new JTextArea();  						//전역으로 뺌! 멤버변수에 대입하기 위해서임
		contentView.setEditable(false); 						//contentView 글자 작성 삭제 불가
		contentScoll.setViewportView(contentView);//////////
		
		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(309, 64, 218, 343);
		contentPane.add(userListScroll);
		
		userListModel = new DefaultListModel<>();
		userList = new JList<String>(userListModel);
		userListScroll.setViewportView(userList);
		
		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(12, 423, 441, 38);
		contentPane.add(messageScroll);
		
		messageInput = new JTextField();
		messageInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					snedMessage();
				}
			}
		});
		messageScroll.setViewportView(messageInput);
		
		JButton sendButton = new JButton("전송");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				snedMessage();
			}
		});
		sendButton.setBounds(458, 425, 69, 23);
		contentPane.add(sendButton);
	}

	private void sendRequest(String resource, String body) {
		OutputStream outputStream;
		try {
			outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);
			
			RequestDto requestDto = new RequestDto(resource, body);
			
			out.println(gson.toJson(requestDto));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void snedMessage() {
		if(!messageInput.getText().isBlank()) { //공백체크 => 비어있지 않을때만 동작.	
			
			String toUser = userList.getSelectedIndex() == 0 ? "all" : userList.getSelectedValue();
		
			MessageReqDto messageReqDto =
					new MessageReqDto(toUser, username, messageInput.getText()); 
				
			sendRequest("sendMessage", gson.toJson(messageReqDto));
			messageInput.setText("");
		}
	}

	private void alreadyCon() throws IOException {
		String ip = null;
		int port = 0;
		
		ip = ipInput.getText();
		port = Integer.parseInt(portInput.getText()); 
		
		if(socket != null) {
			return;
		}else {
			socket = new Socket(ip, port);												 //접속 위한 소켓 생성
			
			JOptionPane.showMessageDialog(null, 
					socket.getInetAddress() + "서버 접속", 
					"접속 성공", 
					JOptionPane.INFORMATION_MESSAGE);
			
			ClientRecive clientRecive = new ClientRecive(socket);
			clientRecive.start();					
			
			username =  JOptionPane.showInputDialog(null, "사용자 이름을 입력해 주세요.", "이름입력", JOptionPane.INFORMATION_MESSAGE);
			JoinReqDto joinReqDto = new JoinReqDto(username);
			String joinReqDtoJson = gson.toJson(joinReqDto);
			RequestDto requestDto = new RequestDto("join", joinReqDtoJson);
			String reqestDtoJson = gson.toJson(requestDto);
			
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);			//output 열면 printWriter 생성해줘야함
			out.println(reqestDtoJson);
		}
	}

}
