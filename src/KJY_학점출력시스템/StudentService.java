package KJY_학점출력시스템;

import java.util.Scanner; //ctrl + shift + O

public class StudentService {
	Scanner scanner ;
	StudentRepository sr;
	Student[] sArray;
//	char select = '\0';
	
	
	
	public StudentService() {
		scanner = new Scanner(System.in);
		sArray = new Student[0];
		sr = new StudentRepository(sArray);
	}
	
	
	
	
	public void run() {
		boolean flag = true;
		char select = '\0';
		
		while(flag) {
			showView();
			select = inputSelected();
			flag = choiceMainMenu(select);
		}
		
	}//run
	
	public void stop() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void showView() {
		System.out.println("=====학점 출력 시스템=====");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 입력 정보 출력");
		System.out.println("3. 학점 확인");
		System.out.println("종료 : \"q\"");
		System.out.println();
		
	
		
	}
	
	public char inputSelected() {
		System.out.print("원하는 메뉴를 선택하세요 : ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select;
	}

	
	
	public boolean Exit(char select) {
		return select == 'q' || select == 'Q';
	}

	
	
	
	private boolean choiceMainMenu(char select) {
		boolean flag = true;
		
		if(Exit(select)) {
			flag = false;
		}else {
			 if(select == '1') {
				 registerStudent();
			 	}else if(select == '2') {
					System.out.println(sr.toString());
				}else if(select == '3') {
					tranceferGrade(score);
				}else {
					System.out.println("다시 입력 바람");
				}
			 System.out.println();
		}
		return flag;
	}

	
	
	String name;
	int score;
	public void registerStudent() {
		System.out.print("이름 입력 : ");
		name = scanner.nextLine();
		System.out.print("점수 입력 : ");
		score = scanner.nextInt();
		scanner.nextLine();
		
		Student student = new Student(name, score);
		
		sr.saveStudent(student);
	}
	

	private void tranceferGrade(int score) {
		if(0 > score || 100 < score) {
			System.out.println("//점수 입력 오류//");
		}
		else if(score > 89) {
			System.out.println("A학점");
		}else if(score > 79) {
			System.out.println("B학점");
		}else if(score > 79) {
			System.out.println("C학점");
		}else if(score > 79) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
	}
	
	
}
