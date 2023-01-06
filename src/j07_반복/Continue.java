package j07_반복;

public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i % 2 != 0) {
				continue; //참일때 다음 반복을 계속 해라(아래 명령문이 남아있어도 계속 실행됨)
			}
			
			System.out.println("i : " + i);
		}
		
		System.out.println("=====================");
		
		
		
//		int i = 0;
//		
//		while(i < 10) {
//		
//			if(j % 2 != 0) {
//				
//				i++;
//				continue;
//			}
//			System.out.println("i : " + j);
//		}
		
		
		int i = 0;
		
		while (i < 10) {
			
			if(i % 2 != 0) {
				i++;
				continue;
			}
			
			System.out.println("i : " + i);
			i++; //i를 2개 써야됨.
		}
			
		
		
		
	}//
}//
