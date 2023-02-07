package j26_스레드;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		LoopThread loopThread1 = new LoopThread("1 김똥개");
		LoopThread loopThread2 = new LoopThread("2 김고양이");
		LoopThread loopThread3 = new LoopThread("3 김고라니");
		LoopThread loopThread4 = new LoopThread("4 김노루");
		
		//전부 5로 나옴. 우선순위가 다 똑같음.(우선순위는 숫자가 클수록 높다)
		
		loopThread1.setPriority(Thread.MAX_PRIORITY);
	
		
		System.out.println(loopThread1.getPriority());
		System.out.println(loopThread2.getPriority());
		System.out.println(loopThread3.getPriority());
		System.out.println(loopThread4.getPriority());
		
		//실행순서가 엉망이다. 모두 동일한 우선순위로 보기 떄문이다.
		loopThread1.start(); //run메소드 호출인아님 start임
		loopThread2.start(); 
		loopThread3.start();
		loopThread4.start();
	}
}
