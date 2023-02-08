package usermanagement.server.controller;

import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;

public class AccountController {

	private static AccountController instance;
	
	private AccountController() {}
	
	public static AccountController getInstance() { //controller를 누군가 사용하고있다면 다른사람은 접근하지 못하게 막는다.(스레드를 쓰는 환경에선 synchronized를 꼭 해줘야함.
		if(instance == null) {
			instance = new AccountController();
		}
		return instance;
	}
	
	public ResponseDto<?> register(User user) {

		return new ResponseDto<String>("ok", "회원가입 성공");
	}
	
	
}
