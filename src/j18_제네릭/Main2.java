package j18_제네릭;

public class Main2 {
//static 메소드 내부에서 외부 static 메소드를 호출하는것은 그냥 호출이 가능하다. 
//하지만 static 메소드 외부에서 static이 아닌 메소드를 호출하려면 객체를 생성하고 참조해야한다.
//왜? static은 객체생성없이 호출 가능하지만 static이 아닌 메소드는 객체생성 후 참조하여 호출해야하기 떄문에.	
	
	
//	public CMRespDto<String> reponse(CMRespDto<String> cmRespDto) { //String 타입만 들어올수있다.
//		System.out.println("[응답데이터]");
//		System.out.println(cmRespDto);
//		return cmRespDto;
//	}

	
	//<?> => 와일드카드 라고 한다. (어떠한 자료형도 들어올 수 있다.)
	//Object는 최상위 class이므로 Object로 형변환 된것과 같다고 보면된다.
	public CMRespDto<?/*==Object*/> reponse(CMRespDto<?/*==Object*/> cmRespDto) {
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	}
	
	
	// <? extedns 부모클래스> => 부모클래스를 상속받은 자식클래스만 들어올 수 있다.
	// <? super Student> => Student가 상속받은 부모클래스만 들어올수있다 (Teacher class 불가)
	
	/*
	 * ?: 와일드카드 / 제약
	 * extends:	대상 객체 하위 (대체로 많이씀)
	 * super  :	대상 객체 상위위
	 * */
	
	
	
	public static void main(String[] args) {
		Main2 main = new Main2();
		
		CMRespDto<String> hello = new CMRespDto<String>(200, "성공", "안녕하세요");
		CMRespDto<Integer> score = new CMRespDto<Integer>(200, "성공", 85);
		
		
		System.out.println("hello");
		System.out.println(main.reponse(hello));

		System.out.println("score");
		System.out.println(main.reponse(score));
		

		
		

		
		
		
		// 
		
		
		
		
	}
}
