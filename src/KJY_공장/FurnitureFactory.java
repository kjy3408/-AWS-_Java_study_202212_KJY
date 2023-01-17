package KJY_공장;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FurnitureFactory implements MakeFurniture {
	
	Scanner scanner = new Scanner(System.in);
	FurnitureRepository fr = new FurnitureRepository();
	Furniture f;
	private int year = LocalDate.now().getYear();
	private int ai = 1;
	private String serialNum = year + "-" + ai;
	char select;
	String code;
	
	
	public FurnitureFactory(Furniture f) {
		this.f = f;
		f.setCode(serialNum);
	}
	
	public void run() {
		boolean flag = true;
	
		while(flag) {
			mainMenu();
			inputSelect();
			flag = selectedMain(select);
			
			
		}
	}

	
	private void mainMenu() {
		System.out.println("가구선택");
		System.out.println("1. 가구예약");
		System.out.println("2. 예약번호 확인");
	
	}
	
	private char inputSelect() {
		select = '\0';
		System.out.println("번호를 눌러주세요");
		select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select;
	}
	
	private boolean selectedMain(char select) {
		boolean flag = true;
		if(select == 'q' || select == 'Q') {
			flag = false;
		}else if(select == '1'){
			make();
		}else if(select == '2') {
			checkReservation();
		}else {
			System.out.println("재입력바람");
		}

		return flag;
	}
	
	
	
	
	public void inputMap() {
		for(int i = 0; i < fr.fmap.size(); i++) {
			if(fr.fmap.get(i) == null) {
				fr.fmap.put(f.getCode(), f.toString());
			}
		}
	}
	
	@Override
	public void make() {
		System.out.print("뭘 제작?: ");
		f.setProductName(scanner.nextLine());
		System.out.println("색깔은?: ");
		f.setColor(scanner
				.nextLine());
		
		inputMap();
		System.out.println(f.toString());
	
		
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void pave() {
		// TODO Auto-generated method stub
		
	}

	public void checkReservation() {
		System.out.println("코드입력: ");
		code = scanner.nextLine();
		
		if(code.equals(f.getCode())){
			System.out.println(f.toString());
		}else {
			System.out.println("실패");
		}
	}
	
	

}
