package simplechatting.client;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

public class ChattingClient extends JFrame {
	
	private Socket socket;
	private String username;
	
	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;
	private JTextField messageInput;
	private JList userList;
	private DefaultListModel<String> userListModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ChattingClient() {
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
		
		JButton connect = new JButton("연결");
		connect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;
				
				ip = ipInput.getName();
				port = Integer.parseInt(portInput.getText()); 									 //String을 Int로 바꾸는 방법! 
				
				try {
					socket = new Socket(ip, port);												 //접속 위한 소켓 생성
					
					JOptionPane.showMessageDialog(null, 
							socket.getInetAddress() + "서버 접속", 
							"접속 성공", 
							JOptionPane.INFORMATION_MESSAGE);
					
					InputStream inputstream = socket.getInputStream(); 							//InputStream 생성.
					BufferedReader in= new BufferedReader(new InputStreamReader(inputstream));  //공식임. Input하기위해 Buff가 있어야함.
					
					if(in.readLine().equals("join")) { 											//server에서 받아온 문자열이 join이면 실행해라.
						username = JOptionPane.showInputDialog(null, "사용자이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE); // 사용자이름을 입력하세요 라는 창을 출력해줌.
						
						OutputStream outputStream = socket.getOutputStream(); 					//서버에 입력한 username을 쓸거라는걸 보내기위한 out
						PrintWriter out = new PrintWriter(outputStream, true); 						
					
						out.println(username);
						
					}
					
					Thread thread = new Thread(()->{
						try {
							InputStream input = socket.getInputStream();
							BufferedReader reader = new BufferedReader(new InputStreamReader(input));//////////////////////////////////////////
							
							while(true) {
								String message = reader.readLine();	//받아온 문자열을 message변수에 받음
								if(message.startsWith("@welcome")) {//뭐로 시작하니?라고 묻는 메소드.
									int tokenIndex = message.indexOf("/");// "/" 의 위치를 찾는 메소드.
									message = message.substring(tokenIndex + 1);//해당 문자열중에서 해당 인덱스전까지 잘라라 라는 메소드.
								}else if(message.startsWith("@userList")) {
//									System.out.println(message);
									int tokenIndex = message.indexOf("/");// "/" 의 위치를 찾는 메소드.
									message = message.substring(tokenIndex + 1);//해당 문자열중에서 해당 인덱스전까지 잘라라 라는 메소드.
									String[] usernames = message.split(",");
									userListModel.clear();
									
									for(String username : usernames) {
										userListModel.addElement(username); //addElement를 사용하면 index가 자동으로 증가. (add를 쓰면 원하는 index에 넣을 수 있는것)
									}
									continue; //continue를 걸어버리면 아래의 contenView가 실행안됨.
								}
								contentView.append(message + "\n"); //contentView에 append임
//								messageInput.setText("");/////////////////////////////////////
							}
							
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					
					});
					
					thread.start();
					
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
		connect.setBounds(458, 20, 69, 23);
		contentPane.add(connect);
		
		portInput = new JTextField();
		portInput.setText("9090"); //미리작성해놈
		portInput.setBounds(395, 10, 51, 44);
		contentPane.add(portInput);
		portInput.setColumns(10);
		
		JScrollPane contentScoll = new JScrollPane();
		contentScoll.setBounds(12, 10, 275, 399);
		contentPane.add(contentScoll);
		
		contentView = new JTextArea();  						//전역으로 뺌! 멤버변수에 대입하기 위해서임
		contentScoll.setViewportView(contentView);
		
		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(309, 64, 218, 343);
		contentPane.add(userListScroll);
		
		userListModel = new DefaultListModel<>();
		userList = new JList(userListModel);
		userListScroll.setViewportView(userList);
		
		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(12, 423, 441, 38);
		contentPane.add(messageScroll);
		
		messageInput = new JTextField();
		messageInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(!messageInput.getText().isBlank()) { //공백체크 => 비어있지 않을때만 동작.	
						try {
							OutputStream outputStream = socket.getOutputStream();
							PrintWriter out = new PrintWriter(outputStream, true);
							
							out.println(username + ": " + messageInput.getText());  
							messageInput.setText("");/////////////////////////////////////							
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		messageScroll.setViewportView(messageInput);
		
		JButton sendButton = new JButton("전송");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!messageInput.getText().isBlank()) { //공백체크 => 비어있지 않을때만 동작.	
					try {
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);
						
						out.println(username + ": " + messageInput.getText());  
						messageInput.setText("");/////////////////////////////////////				
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		sendButton.setBounds(458, 425, 69, 23);
		contentPane.add(sendButton);
	}
}
