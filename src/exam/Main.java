package exam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//h 23 m 60
		
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		
		if(H > 0 && 0 > M) {
			H = H - 1;
			M = 59;
			System.out.println(H);
			System.out.println(M);
		}
		
		if(0 > H) {
			H = H + 23;
		}
		
	
	}
	
}
