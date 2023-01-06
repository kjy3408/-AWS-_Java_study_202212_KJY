package j07_반복;

import java.util.Scanner;

public class Menu {
//		System.out.println(name.charAt(0));//글자 하나를 캐릭터 자료형으로 가져온다. 0번 index의 자리 "문자"를 가져온다.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int total = 0;
		int total1 = 0;
		int total2 = 0;
		
		String[] a = {"김치라면", "돌솥비빔밥", "오므라이스", "김치볶음밥"};
		int[] a1 = {5000, 8000, 6000, 6500};
		String[] b = {"탄탄면", "사천탄탄면", "새우탕면", "치즈탄탄면"};
		int[] b1 = {7000, 9500, 8500, 7900};
		String[] c = {"스테이크 덮밥", "연어 덮밥","간장새우 덮밥", "연어 아보카도 덮밥"};
		int[] c1 = {11000, 10000, 12000, 14000};
		String[] d = {"닭가슴살샐러드", "쉬림프샐러드", "리코타치즈샐러드","시져샐러드"};
		int[] d1 = {};
		
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';		
			
			System.out.println("========<<식당 메뉴>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("=============================");
			System.out.println("q. 프로그램 종료");
			System.out.println("=============================");
			
			System.out.print("식상 선택 : ");
			select = scanner.next().charAt(0);
			System.out.println();
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
				
			}else if(select == '1') { //여기서 또 다시 다 만들어야됨.
				
				boolean loopFlag2 = true;
				
				while(loopFlag2) { //그냥 true를 줘도 break;를 주면 상관없지만 메뉴를 고르고 식당에 들어갔을땐 바깥쪽 while은 멈출 수 없음.
				System.out.println("========<<김밥천국>>========");
				
				for(int i = 0; i < a.length; i++) {//메뉴 출력
					System.out.println(i + 1 + ". " + a[i]);
				}
				
				System.out.println("=============================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=============================");
				
				System.out.print("메뉴 번호 선택 : ");
				select = scanner.next().charAt(0);
				
				
				if(select == 'b') {
					loopFlag2 = false; //break;대신 변수로 멈춰준것.
				}else if(select == 'q' || select == 'Q') { //q를 누르면 안쪽과 바깥쪽 while 둘 다 멈추게 된다. break;를 사용하면 바깥쪽 while은 멈추지않는다
					loopFlag1 = false; //바깥쪽 while
					loopFlag2 = false; //안쪽 while
				}else if(select == '1') {// 김밥천국
					System.out.println(a[0] + "을 선택했습니다." +  a1[0] + "원"); 
					total = total + a1[0];
				}else if(select == '2') {
					System.out.println(a[1] + "을 선택했습니다."+ a1[0] + "원");
					total = total + a1[1];
				}else if(select == '3') {
					System.out.println(a[2] + "를 선택했습니다."+ a1[0] + "원");
					total = total + a1[2];
				}else if(select == '4') { 
					System.out.println(a[3] + "을 선택했습니다."+ a1[0] + "원");
					total = total + a1[3];
				}else {	
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				
				}
				System.out.println("총 가격:		" + total + "원");
				System.out.println();
			}
				
			}else if (select == '2') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) { //그냥 true를 줘도 break;를 주면 상관없지만 메뉴를 고르고 식당에 들어갔을땐 바깥쪽 while은 멈출 수 없음.
				System.out.println("========<<탄탄면>>========");
				for(int i = 0; i < b.length; i++) {
					System.out.println(i + 1 + ". " + b[i]);
				}
				System.out.println("=============================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=============================");
				
				System.out.print("메뉴 번호 선택 : ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false; //break;대신 변수로 멈춰준것.
				}else if(select == 'q' || select == 'Q') { //q를 누르면 안쪽과 바깥쪽 while 둘 다 멈추게 된다. break;를 사용하면 바깥쪽 while은 멈추지않는다
					loopFlag1 = false; //바깥쪽 while
					loopFlag2 = false; //안쪽 while
				}else if(select == '1') { // 탄탄면
					System.out.println(b[0] + "을 선택했습니다." + b1[0] + "원");
					total1 = total1 + b1[0];
				}else if(select == '2') {
					System.out.println(b[1] + "을 선택했습니다." + b1[0] + "원");
					total1 = total1 + b1[1];
				}else if(select == '3') {
					System.out.println(b[2] + "을 선택했습니다." + b1[0] + "원");
					total1 = total1 + b1[2];
				}else if(select == '4') { 
					System.out.println(b[3] + "을 선택했습니다." + b1[0] + "원");
					total1 = total1 + b1[3];
				}else {	
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					
				}
				System.out.println("총 가격:		" + total1 + "원");
				System.out.println();
			}
				
			}else if (select == '3') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) { //그냥 true를 줘도 break;를 주면 상관없지만 메뉴를 고르고 식당에 들어갔을땐 바깥쪽 while은 멈출 수 없음.
				System.out.println("========<<홍대개미>>========");
				for(int i = 0; i < c.length; i++) {
					System.out.println(i + 1 + ". " + c[i]);
				}
				System.out.println("=============================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=============================");
				
				System.out.print("메뉴 번호 선택 : ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false; //break;대신 변수로 멈춰준것.
				}else if(select == 'q' || select == 'Q') { //q를 누르면 안쪽과 바깥쪽 while 둘 다 멈추게 된다. break;를 사용하면 바깥쪽 while은 멈추지않는다
					loopFlag1 = false; //바깥쪽 while
					loopFlag2 = false; //안쪽 while
				}else if(select == '1') {
					System.out.println(c[0] + "을 선택했습니다.");
					total2 = total2 + c1[0];
				}else if(select == '2') {
					System.out.println(c[1] + "을 선택했습니다.");
					total2 = total2 + c1[1];
				}else if(select == '3') {
					System.out.println(c[2] + "를 선택했습니다.");
					total2 = total2 + c1[2];
				}else if(select == '4') { 
					System.out.println(c[3] + "덮밥을 선택했습니다.");
					total2 = total2 + c1[3];
				}else {	
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					
				}
				System.out.println("총 결제: " + total2 + "원");
				System.out.println();
			}
			}else if (select == '4') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) { //그냥 true를 줘도 break;를 주면 상관없지만 메뉴를 고르고 식당에 들어갔을땐 바깥쪽 while은 멈출 수 없음.
				System.out.println("========<<밥앤밥>>========");
				System.out.println("1. 닭가슴살샐러드");
				System.out.println("2. 쉬림프샐러드");
				System.out.println("3. 리코타치즈샐러드");
				System.out.println("4. 시져샐러드");
				System.out.println("=============================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=============================");
				
				System.out.print("메뉴 번호 선택 : ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false; //break;대신 변수로 멈춰준것.
				}else if(select == 'q' || select == 'Q') { //q를 누르면 안쪽과 바깥쪽 while 둘 다 멈추게 된다. break;를 사용하면 바깥쪽 while은 멈추지않는다
					loopFlag1 = false; //바깥쪽 while
					loopFlag2 = false; //안쪽 while
				}else if(select == '1') {
					System.out.println("닭가슴살샐러드를 선택했습니다.");
				}else if(select == '2') {
					System.out.println("쉬림프샐러드를 선택했습니다.");
				}else if(select == '3') {
					System.out.println("리코타치즈샐러드를 선택했습니다.");
				}else if(select == '4') { 
					System.out.println("시져샐러드을 선택했습니다.");
				}else {	
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					
				}
				System.out.println();
			}
			}else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
				
				System.out.println();
		}
		System.out.println("프로그램 정상 종료!!!!!!");
	
	
		
		
		
		
		
		
	}
}
