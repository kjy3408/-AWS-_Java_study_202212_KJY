package usermanagement.frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.google.gson.JsonObject;

import usermanagement.service.UserService;

public class UserManagementFrame extends JFrame {
	
	private List<JTextField>loginFields;
	private List<JTextField> registerFields;

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernamefield;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public UserManagementFrame() {
		
		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>(); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		
	
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logoText = new JLabel("UserManagement");
		logoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setBounds(84, 28, 212, 72);
		loginPanel.add(logoText);
		
		JLabel loginText = new JLabel("Login");
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setFont(new Font("D2Coding", Font.BOLD, 20));
		loginText.setBounds(123, 74, 125, 52);
		loginPanel.add(loginText);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(49, 189, 285, 21);
		loginPanel.add(usernamefield);
		usernamefield.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(49, 245, 285, 21);
		loginPanel.add(passwordField);
		
		JLabel usernameLabel = new JLabel("Username or email");
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		usernameLabel.setBounds(49, 164, 113, 15);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		passwordLabel.setBounds(49, 220, 113, 15);
		loginPanel.add(passwordLabel);
		
		JButton loginButton = new JButton("Login");
		
		
		loginButton.addMouseListener(new MouseAdapter() {//interface에서 구현해야하는 메소드들을 Adapter class에서 실행문을 비워놓은 채로 미리 구현해놓고, Adapter class를 참조하여 원하는 메소드만 사용가능.
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		loginButton.setFont(new Font("D2Coding", Font.BOLD, 15));
		loginButton.setBounds(49, 295, 285, 37);
		loginPanel.add(loginButton);
		
		JLabel singupDesc = new JLabel("Don't have an account?");
		singupDesc.setFont(new Font("D2Coding", Font.BOLD, 14));
		singupDesc.setHorizontalAlignment(SwingConstants.RIGHT);
		singupDesc.setBounds(12, 364, 212, 21);
		loginPanel.add(singupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
				clearFields(loginFields);
			}
		});
		signupLink.setForeground(new Color(0, 128, 255));
		signupLink.setFont(new Font("굴림", Font.BOLD, 13));
		signupLink.setHorizontalAlignment(SwingConstants.CENTER);
		signupLink.setBounds(219, 364, 96, 21);
		loginPanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("Forgot your password?");
		forgotPasswordLink.setForeground(new Color(0, 128, 255));
		forgotPasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPasswordLink.setFont(new Font("D2Coding", Font.BOLD, 14));
		forgotPasswordLink.setBounds(84, 395, 212, 21);
		loginPanel.add(forgotPasswordLink);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signinLink = new JLabel("Sign in");
		signinLink.setForeground(new Color(0, 128, 255));
		signinLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
				clearFields(registerFields);
			}
		});
		signinLink.setFont(new Font("D2Coding", Font.BOLD, 15));
		signinLink.setHorizontalAlignment(SwingConstants.CENTER);
		signinLink.setBounds(271, 420, 67, 18);
		registerPanel.add(signinLink);
		
		JLabel registerLogoText = new JLabel("UserManagement");
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerLogoText.setBounds(84, 28, 212, 72);
		registerPanel.add(registerLogoText);
		
		JLabel registerText = new JLabel("Register");
		registerText.setHorizontalAlignment(SwingConstants.CENTER);
		registerText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerText.setBounds(123, 74, 125, 52);
		registerPanel.add(registerText);
		
		JLabel registerUsernameLabel = new JLabel("Username");
		registerUsernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerUsernameLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerUsernameLabel.setBounds(53, 136, 113, 15);
		registerPanel.add(registerUsernameLabel);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(53, 161, 285, 21);
		registerPanel.add(registerUsernameField);
		
		JLabel registerPasswordLabel = new JLabel("Password");
		registerPasswordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerPasswordLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerPasswordLabel.setBounds(53, 192, 113, 15);
		registerPanel.add(registerPasswordLabel);
		
		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(53, 217, 285, 21);
		registerPanel.add(registerPasswordField);
		
		JLabel registerNameLabel = new JLabel("name");
		registerNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerNameLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerNameLabel.setBounds(53, 248, 113, 15);
		registerPanel.add(registerNameLabel);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(53, 273, 285, 21);
		registerPanel.add(registerNameField);
		
		JLabel registerEmailLabel = new JLabel("email");
		registerEmailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerEmailLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerEmailLabel.setBounds(53, 304, 113, 15);
		registerPanel.add(registerEmailLabel);
		
		registerEmailField = new JTextField();
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(53, 329, 285, 21);
		registerPanel.add(registerEmailField);
		
		JButton registerButton = new JButton("Register");
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameField.getText());
				userJson.addProperty("password", registerPasswordField.getText());
				userJson.addProperty("name", registerNameField.getText());
				userJson.addProperty("email", registerEmailField.getText());
				
				UserService userService = UserService.getInstance();
				
				Map<String, String>	response = userService.register(userJson.toString());
				
				if(response.containsKey("error")) {
					JOptionPane.showMessageDialog(null, response.get("error"), "error", JOptionPane.ERROR_MESSAGE); //error메세지 띄우는 기능.
					return;
				}
				
				JOptionPane.showMessageDialog(null, response.get("ok"), "ok", JOptionPane.INFORMATION_MESSAGE);
				mainCard.show(mainPanel, "loginPanel");
				clearFields(registerFields); //화면 전환 일어날때마다 해줘야함.
			}
		});
		registerButton.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerButton.setBounds(53, 373, 285, 37);
		registerPanel.add(registerButton);
		
		loginFields.add(usernamefield);		
		loginFields.add(passwordField);	
		
		registerFields.add(registerUsernameField);
		registerFields.add(registerPasswordField);
		registerFields.add(registerNameField);
		registerFields.add(registerEmailField);
	}
		
	private void clearFields(List<JTextField> textFields) {
		for(JTextField field : textFields) {
			if(field.getText().isEmpty()) {//isEmpty공백을 text로 보겠다(spaceBar조차 없다.) != (isBlank 공백을 text로 보지않겠다.)
				continue;
			}
			field.setText("");
		}
	}


}
