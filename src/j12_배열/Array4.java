package j12_배열;

public class Array4 {

	public static void main(String[] args) {
		J12_User[] users = new J12_User[3]; //배열객체 만드는 방법(객체를 담는 공간3개)
		
		J12_User[] users2 = new J12_User[] {//new J12_User[] 생략가능
				new J12_User("aaa", "1234", "김종환", "aaa@gmail.com"),
				new J12_User("bbb", "1234", "이종현", "bbb@gmail.com"),
				new J12_User("ccc", "1234", "진채희", "ccc@gmail.com")
		};
		
		
		J12_User[] users3 = { //new J12_User[] 생략함
				new J12_User("aaa", "1234", "김종환", "aaa@gmail.com"),
				new J12_User("bbb", "1234", "이종현", "bbb@gmail.com"),
				new J12_User("ccc", "1234", "진채희", "ccc@gmail.com")
		};
		
		
		
		users[0] = new J12_User("aaa", "1234", "김종환", "aaa@gmail.com"); //인덱스에 객체의 필드들을 넣음
		users[1] = new J12_User("bbb", "1234", "이종현", "bbb@gmail.com");
		users[2] = new J12_User("ccc", "1234", "진채희", "ccc@gmail.com");
	
	
		for(int i = 0; i < users.length; i++) {//필드에 값들을 객체배열을 사용해 넣어주고 this키워드때문에 toString메소드에 값이 들어가서 호출된다.
			System.out.println(users[i].toString());
		}
	
		
		
	}
	
}
