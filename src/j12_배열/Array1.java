package j12_배열;

public class Array1 {
	
	public static void main(String[] args) {
		
		int num1 = 10; 
		int num2 = 20; 
		int num3 = 30; 
		int num4 = 40; 
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
								//참조자료형도 배열로 만들 수 있다.(calss) => 객체를 배열로 만든다. (Student[] s = new Student[5]; =>s[0] = 자식객체?)
		int[] nums = new int[5];//new 키워드가 들어가면 참조형이다.(배열은 참조자료형이다) / new키워드는 동적할당(힙 메모리 할당)이다
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
