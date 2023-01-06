package j04_연산자;
/*
 * 논리연산자
 * 
 * */
public class Operation3 {
	
	public static void main(String[] args) {
			int num = 11;
			
			boolean flag1 = true;
			boolean flag2 = true;
			boolean flag3 = num % 2 == 0;//값은 false num = 10이라면 true  
			boolean flag4 = num % 2 > 0;//양수인지 음수인지 확인
			
			System.out.println(flag1 && flag2);
			System.out.println(flag1 && flag3); //&&은 곱이므로 둘중 하나라도 false면 flase다
			System.out.println(flag2 || flag3 && flag1); //||이면 하나라도 true면 true다 
			System.out.println(!(flag2 || flag3 && flag1)); //값이 true인데 ! 부정으로 false 출력 
	}
}