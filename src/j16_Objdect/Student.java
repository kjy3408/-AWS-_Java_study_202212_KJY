package j16_Objdect;

import java.util.Objects;

public class Student /*extends Object 얘 생략돼있음 항상 모든 클래스에*/{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();//상속받은적 없는데 super가 생김(Object class 생성자 임) -> class를 만들대 Object 클래스를 superclass로 함.
		//Object class는 최상위 class이다. 항상 모든 class는 Object를 가진다.
		this.name = name;
		this.age = age; 
	}
			
	@Override
	public int hashCode() {
	//Objects객체를 관리할 수있는 도구들이 들어있음
	
		return Objects.hash(name, age); //들어온 값으로 숫자로 조합(hash)한것을 리턴해준다. 
	}
//	Object는 모든 class의 최상위에 있기에 매개값으로 고저이다.
	@Override //student안에있는 값들을 비교할 수 있게끔 Override하여 바꿔줘야한다.
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;//주소가 같으면 무조건 true.
		}
		if(obj == null) {
			return false; //null과 비교는 무조건 false.
		}
		
		if(!(obj.getClass() == Student.class)) { //instanceof보다 더 정확한 비교를 해주므로 다운캐스팅할때 용이함.
			return false;
		}
		if(!(obj instanceof Student)) { //obj가 Student class가 아니라면! false; => instanceof는 상속관계일 땐 true로 나와버리기 때문에 애매한경우도생김.
			return false;
		}
		
		Student s = (Student) obj;
		boolean result = name.equals(s.name)  && age == s.age;
	
		return result;
	}
	
	@Override
	public String toString() {//Object class에 있는 toString을 Override해줌.
		// TODO Auto-generated method stub
		return "이름: " + name + "\n나이: " + age;
	}
	
	
	
	
	
}
