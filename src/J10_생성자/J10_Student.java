package j10_생성자;

public class J10_Student {
	
	//기본생성자는 생략되어있다. 만약 생성자의 오버로딩이 일어나면 기본생성자는 비활성화된다.
		//=> 기본생성자 외에 생성자가 하나라도 더 생긴다면 기본생성자 사용불가
		//=> 사용을 원한다면 기본생성자도 명시해줘야한다.
		
			//참조변수, 레퍼런스변수, 멤버변수라고 부른다.  기본적으로 멤버 라고 부른다.
		public String name;
		public int age;
		
		J10_Student() {
			System.out.println("기본 생성자 호출");
		}
			J10_Student(int age){
			System.out.println("학생의 나이: " + age);
		}
		
		J10_Student(String name){
			System.out.println("학생의 이름: " + name);
		}
		
		J10_Student(String name, int age){
			this.name = name;
			this.age = age;
			//this는 자신(내부클래스)의 주소를 참조한다.
		}
		
		void printInfo() {
			System.out.println("학생 이름: " + name);
			System.out.println("학생 나이: " + age);
			
		}
		//public 은 변수, 메소드(생성자) 앞에 붙을 수 있다.
		//클래스는 지역변수와 멤버변수를 구분지어 따로 생각한다. 그래서 멤버변수의 이름으로 지역변수 선언가능
	
}





