package j12_배열;
// Entity : 정보를 담는 객체(필드/멤버변수)
//비지니스로직 : 실행용도 (Main)
public class J12_User {
	
	private String username;	//사용자이름(아이디) => ID라고 하지않음 userName이라고 함
	private String password;	//비밀번호
	private String name;		//사용자 성명(사용자이름과 헷갈리지말자)
	private String email;		//이메일
	
	public J12_User() { //아무것도 없는상태에서 Ctrl + Space => 기본생성자 만들어짐
	
	}

	public J12_User(String username, String password, String name, String email) { //Alt + Shift + S + using field => 
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {//Alt + Shift + s + toString : String타입으로 반환해주는 toString 메소드?
		return "J12_User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}

	
	
	
}
