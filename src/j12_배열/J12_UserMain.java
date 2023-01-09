package j12_배열;

public class J12_UserMain {
//new 키워드는 제일 상위에서만 사용하는게 결합도가 낮은 코드다. %%주의%%
		public static void main(String[] args) {
			//UserService에서 객체 생성이 아닌 Main에서 객체/배열 생성.
			J12_User[] users = new J12_User[0]; //repository 객체 만들기 위해 매개변수로 넣기위해 빈 배열 하나 만듬.
//			J12_User[] users2 = new J12_User[100];
			
			J12_UserRepository userRepository = new J12_UserRepository(users);//service 생성자 호출을 위해 객체생성(매개변수로 받기위해)
//			J12_UserRepository userRepository2 = new J12_UserRepository(users2);//service 생성자 호출을 위해 객체생성(매개변수로 받기위해)
			
			
			J12_UserService service = new J12_UserService(userRepository);
			//service 객체를 만들기 위해 repository를 매개변수로 받기로 작성함.
						
			
			
			service.run(); //무한루프.. run이 끝나면 stop()이 시작된다.
			service.stop();
			
		}
		
		
		//User -> repository -> sercive
		
		
		/*
		 *Main <=> service <=> repository == repository.userTable[]
		 * 항상 단계를 건너뛰지말고 각각의 역할에 맞게 가져와야한다.
		 * Main => repository (X)
		 * Main => service => repository (O)
		 * 
		 * 이 구조를 적응해야한다.
		 * MVC => Service => Repository => DB(배열)와 같은 구조다 
		 * */
	

}
