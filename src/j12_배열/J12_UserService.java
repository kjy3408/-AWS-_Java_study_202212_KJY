package j12_배열;

import java.util.Scanner;
//전역으로 쓰지않고도 return을 하여 값을 대입해주면 된다. (예시 : select, loopFlag 등)
public class J12_UserService {
	
	private Scanner scanner; // Ctrl + Shift + O 
	J12_UserRepository userRepository;
//	J12_User[] users;
	
	public J12_UserService(J12_UserRepository userRepository) { //결합도 낮은 코드.(매개변수로 받음) //생성자호출하면 스캐너 생성. => 생성돼야지만 메모리 할당되게끔 해놈 전역으로 작성했다면 쓰지도 않는데 메모리를 잡아먹게됨
		scanner = new Scanner(System.in);
		this.userRepository = userRepository;
//		users = new J12_User[0];
	}
		
	
	public void run() {																	//run() : 실행 메소드
		boolean loopFlag = true;														//
		boolean flag = true;
		char select = '\0';																	//char select 초기화
	
		while(loopFlag) {																//메뉴를 보여주기위한 무한루프
			showMainMenu();																//showMainMenu()메소드 호출 : 메뉴를 콘솔창에 보여주는 로직
			select = inputSelect("메인");												//select변수에 inputSelect() 메소드를 넣음 : inputSelect()메소드는 select 입력값 받아서 리턴해주는 메소드임
			loopFlag = mainMenu(select);												//while문을 돌리는 loopFlag변수에 mainMenu()메소드를 넣음 : mainMenu(select)는 입력받은 select값을 넣어주어 안에서 if문 실행
			System.out.println();	
			
		}	
	
	
	}
	
	
	
	public void stop() {	//Thread사용												//멈추는 메소드 : main메소드에서 run()메소드의 무한루프가 끝나고나면 실행됨.
		for(int i = 0; i < 11; i++) {
			try {																		//예외처리문 try ~ catch문
				Thread.sleep(500);														//출력 속도 설정
				System.out.println("프로그램 종료중...(" + (i) + "/10)");				
			} catch (InterruptedException e) {											//발생 예외 처리
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

	
	private char inputSelect(String menuName) { 										//변수 select에 들어가는 메소드 
		System.out.print(menuName +" 메뉴 선택: ");
		char select = scanner.next().charAt(0);											//버퍼생겨서 버퍼 지워줘야됨 //select값 입력는 역할.
		scanner.nextLine();																//버퍼생겨서 버퍼 지워줘야됨
		return select;																	//이후 쓰일 select에 입력받은 값을 리턴해주는 역할
	}
	
	
	private void showMainMenu() {														//단순 메뉴 설명창.
		System.out.println("========<< 메인 메뉴 >>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자 이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("===============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	
	
	private void showUsers() {
//		userRepository.getUserTable(); 
		J12_User[] users = userRepository.getUserTable();
		
		System.out.println("========<< 회원 전체 조회 >>========");
		//for ~ each 사용
		for(J12_User user: users) {
			System.out.println(user.toString());
		}
		
		System.out.println("====================================");
	}
	
	
	private void userFind() {
		J12_User[] use = userRepository.getUserTable();
		
		System.out.println("찾으시는 회원 이름 : ");
		J12_User users = userRepository.findUserByUsername(scanner.nextLine());
		
		if(use[0].equals(users)) {
			System.out.println(users.toString());
		}else {
			System.out.println("찾는사람없음");
		}
		
		
		
	}
	
	private void changeInfo() {
		J12_User[] use = userRepository.getUserTable();
		
		System.out.println("========<< 회원 정보 수정 >>========");
		System.out.println("1. 회원 비밀번호 변경: ");
		J12_User user = userRepository.changePass(scanner.nextLine());
		if(use[1].equals(user)) {
			System.out.println("비번같음");
		}else {
			use[1] = user;
		}
//		System.out.println("2. 회원 이름 변경: ");
//		System.out.println("3. 회원 이메일 변경: ");
			
	}
	
	
	
	
	


	private void registerUser() {
		J12_User user = new J12_User();
		
		System.out.println("========<< 회원 등록 >>========");
		System.out.print("사용자ID: ");
		user.setUsername(scanner.nextLine());											//setter을 써서 입력받은 값을 J12_User에다 넣는다.
		
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
				
		System.out.print("성명: ");
		user.setName(scanner.nextLine());
		
		System.out.print("이메일: ");
		user.setEmail(scanner.nextLine());
		
		userRepository.saveUser(user);//얘안하면 값 저장안됨							//각각의 값을 입력받고 userRepository에 저장하는 메소드

		
	}
	
	/*
	 * 1. 사용자이름을 회원 조회
	 * 
	 * 2. 회원 정보 수정
	 * 	1번. 비번 변경
	 * 	2번. 이름 변경
	 * 	3번. 이메일 변경
	 * 
	 * 	b. 뒤로가기....(while문 종료)
	 * 
	 * */
	private void noFound() {///
		System.out.println("찾으시는 회원 없음");
	}
	
	

	private boolean mainMenu(char select) {												//mainMenu메소드에 입력받은 select값을 매개값으로 넣어줌.
		boolean flag = true;															//변수 flag를 true로 선언
		
		if(isExit(select)) {															//입력받은 select가 매개값으로 들어오면 flag가 false로 바뀜.
			flag = false;
		
		}else {																			//입력받은 select에 해당하는 번호가 출력됨.
			if(select == '1') {
				showUsers();
				
			}else if(select == '2') {
				registerUser();
			}else if(select == '3') {
				userFind();
			}else if(select == '4') {
				changeInfo();
			}else {																		//해당하는 번호가 없다면 getSelectedErrorMessage()메소드 실행
				System.out.println(getSelectedErrorMessage());
			}
			
		}
		System.out.println();
		
		return flag;																	//mainMenu()메소드 호출시 현재 falg상태 리턴.
		
	}
		
	
	
	private boolean isExit(char select) {												//select에 q나 Q 값을 넣게되면 호출한곳으로 입력한 값이 참이라는 것을 리턴해줌(boolean타입) 
		return select == 'q' || select == 'Q';
	}
	
	private String getSelectedErrorMessage() {											//메소드를 호출하면 메세지 리턴해줌.
		return "###<< 잘못된 입력입니다. 다시 입력하세요. >>>###";
	}
	
	
	

}
