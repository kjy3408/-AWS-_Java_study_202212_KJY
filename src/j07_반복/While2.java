package j07_반복;

public class While2 {
	public static void main(String[] args) {
		
		
		int i = 0;
//		int j = 0; 외부에쓰면 카운트가안됨
		
		while (i < 10) {
			int j = 0;
			
			while (j < i + 1) {
				System.out.println("*");
				
				j++;
			}
		}
		
		System.out.println();
		
		i++;
	}
}
