package j16_Objdect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

//getClass의 용도를 알고 사용(타입확인할 때 씀)
public class ObjectGetClass {
//instanceof는 상속되어있으면 모호하다. 그렇기에 클래스 비교를 할땐 obj.getClass == 클래스명.class 사용
	//마우스를 올리면 어떤 타입으로 리턴하는지 나옴
	public static void main(String[] args) {
		Student student = new Student("김재영", 29);
		
		System.out.println(student.getClass());//위와 같은녀석 (무슨 class로 만들어진건지 출력함)
		System.out.println(Student.class);//위와 같은녀석(Student class의 정보를 가져옴 => 명확하게 어떤 클래스인지 가져오기에 다운캐스팅 할때 더 정확함)

		System.out.println(student.getClass().getName());//
	
		System.out.println(student.getClass() == Student.class);
		//getclass 는 생성된 인스턴스일때 호출할 수있고
		//. class 는 클래스명으로 호출한다.
		//getclass는 다운캐스팅할때 씀 
		//.class는 타입변환할때 사용.
		
		Class studentclass = student.getClass(); //student.getClass()를 변수에 넣음.(굳이 안넣어도 됨;)
		
		String className = studentclass.getName(); //student.getClass().getName()이나 / studentclass.getName() 이나 같다.
	
		System.out.println("패키지 + 클래스 이름: " + className);
		
		String simpleName = studentclass.getSimpleName();
		System.out.println("클래스 이름만: " + simpleName);//이렇게하면 다른 클래스에도 Student 클래스가 있을 수 있기 떄문에 위껄로 씀.
		System.out.println("클래스 이름만: " + studentclass.getSimpleName());//이렇게해도 상관없음.
		
		System.out.println("패키지 + 클래스 이름: " +student.getClass().getName());
		System.out.println("클래스 이름만: " + student.getClass().getSimpleName());
		
		System.out.println();
		//마우스 올리면 해당 타입 나오니 변수에 넣을때 해당타입으로 변수 선언
		Field[] fields =  studentclass.getDeclaredFields();
		for(Field field : fields) {
			System.out.println("필드 출력: " + field);
		}
	
		Method[] methods = studentclass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("메소드 출력 : " + method);
		}
//		
//		Objects. =equals, hash , toString
//		Class.class. = getField, getMethod, getName
	

			
	
	}
}
