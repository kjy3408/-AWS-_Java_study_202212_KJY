package J14_추상;

//클래스안에 추상메소드(abstract method)가 하나라도 있으면 추상클래스(abstract class)가 된다.
public abstract class Transportation {

	
	
	
	public abstract void go();//추상메소드 => 중괄호가 없다 => 실행할 명령이 없다 => 니가 구현해라
	
	public abstract void stop(); 
	
	
	
	//abstract class(추상 클래스)는 new키워드를 사용생성할수없다.
}
