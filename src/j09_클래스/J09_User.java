package j09_클래스;

public class J09_User {

	
	String userName; //ID
	int password; //PS
	String name;
	String email;
	
	void printUserInfo() {
		System.out.println("아이디: " + userName);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
	}
	

}
