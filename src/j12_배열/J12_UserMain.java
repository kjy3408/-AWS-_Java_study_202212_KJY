package j12_배열;

public class J12_UserMain {

		public static void main(String[] args) {
			
			J12_UserService service = new J12_UserService();
		
						
			
			
			service.run(); //무한루프.. run이 끝나면 stop()이 시작된다.
			service.stop();
			
		}
		
		
		
		
	

}
