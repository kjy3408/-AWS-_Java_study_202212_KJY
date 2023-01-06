package j09_클래스;

public class j09_UserMain {

	public static void main(String[] args) {
		System.out.println("=====김종환=====");
		
		J09_User p1 = new J09_User();
		p1.userName = "aaa";
		p1.password = 1234;
		p1.name = "김종환";
		p1.email = "aaa@gamil.com";
		
		p1.printUserInfo();

		System.out.println("\n=====홍길동=====");
		
		p1.userName = "bbb";
		p1.password = 1561;
		p1.name = "홍길동";
		p1.email = "bbb@naver.com";
		
		p1.printUserInfo();
		
		System.out.println("\n=====김똥개=====");
		
		p1.userName = "asdfasdf";
		p1.password = 4158615;
		p1.name = "김똥개";
		p1.email = "asdfadf@daum.com";

		p1.printUserInfo();
		
		
		
	}

}
