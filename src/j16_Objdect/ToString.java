package j16_Objdect;

public class ToString {
	
	public static void main(String[] args) {
		//Object는 java Library속 lang에 들어있다.
//		Object obj = new Object();
//		
//		System.out.println(obj);
//		
////		String str2 = obj; //Object자료형을 String타입에 넣는건 말이안된다. 
//		//toString을 담고싶다면 꼭 obj.toString을 하여 담아줘야한다.
//		
//		
//		String str = obj.toString();
//		
//		System.out.println(str);
	
		Student student1 = new Student("김똥개", 34); 	//생성자를 통해 각 변수에 값 저장 후 toString method를 Override 하여 출력.
		Student student2 = new Student("김고양이", 30);
		Student student3 = new Student("김노루", 31);
		Student student4 = new Student("이고라니", 28);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
	
		System.out.println();
		
		System.out.println(student1.toString());//이거나 위에꺼나 같음.(이렇게 쓰는 경우도 있긴있음)
	
	}
}
