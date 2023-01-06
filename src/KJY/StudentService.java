package KJY;

import java.util.Scanner;

public class StudentService {
	
	
	Scanner scanner = null;
	private char select;
	
	public StudentService() {
		scanner = new Scanner(System.in);
	}
	
	
	public boolean stop(char select) {
		if(select == '3' || select == 'x') {
			return false;
		}
		
		return false;
	}
	
	
	public void run() {
		boolean flag = true;
		
		while(flag) {
			if(flag) {
			System.out.println("========사용자 정보 입력창========");
			System.out.println("1. 학생 이름");
			System.out.println("2. 점수 ");
			System.out.println("3. 학점 확인");
			System.out.println("====================================");
			System.out.println("번호 입력: ");
			select = scanner.next().charAt(0);
			}
		
		
		}
	
	
		
		
		
	}
}
