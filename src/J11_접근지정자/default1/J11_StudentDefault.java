package J11_접근지정자.default1;
//캡슐화 : 은닉, 외부로 부터 값을 보호함
public class J11_StudentDefault {//클래스에 public이 붙어있으니 다른 패키지에서 불러올 수 있음.
//아무것도 붙지 않은 상태는 default 상태이다.(다른 패키지 접근 불가)
	private String name; //멤버변수는 private로 작성한다 (데이터의 은닉 - 접근불가로 만든다)
	private int age;
	
	public J11_StudentDefault() {
		
	}
	
	public J11_StudentDefault(String name, int age){
		this.name = name; //this를 사용해 매개변수와 멤버변수간의 연결
		this.age = age;
	}
	//메소드는 private로 작성하면 안된다. (은행원이랑 단절됨)
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	
	//메소드는 private로 작성하면 안된다. (은행원이랑 단절됨)
	public String getName() {//Getter
		return name;
	}
	//setName에 매개 값을 name에 넣고 getName으로 호출한다.(setName은 돈을 넣는 직원 getName은 돈을 빼는 직업)
	public void setName(String name) {//Setter
		this.name = name;
	
	
	//Alt + Shift + S : Getter/Setter 만드는 단축키(메뉴중 "Generate Getters and Setters")
	
	}
}
