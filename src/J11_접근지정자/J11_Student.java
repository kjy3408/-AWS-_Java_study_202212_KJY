package J11_접근지정자;

public class J11_Student {
//아무것도 붙지 않은 상태는 default 상태이다.(다른 패키지 접근 불가)
	private String name;
	private int age;
	
//	Alt + Shift + S : 아래 3번째 (생성자 생성) 
//	Alt + Shift + S : Getter/Setter 생성
	
	
	public J11_Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() { 
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	
	
	
}
