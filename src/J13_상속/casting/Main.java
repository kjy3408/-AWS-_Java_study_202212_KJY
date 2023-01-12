package J13_상속.casting;

public class Main {

	public static void main(String[] args) {
		//부품(객체) 갈아 끼우기
//		
//		View view = new View();
//		
//		view.show();//show메소드에 아무것도 없음
//		
//		
//		view = new MainView();
//		
//		view.show(); //MainView에서 오버라이딩 한 메소드 출력
//		
//		
//		view = new UpdateView();
//
//		view.show(); //UpdateView에서 오버라이딩 한 메소드 출력
//		
		
		Controller controller = new Controller(new MainView());
		controller.run();
		
		System.out.println("프로그램 종료");
		
	}

}
