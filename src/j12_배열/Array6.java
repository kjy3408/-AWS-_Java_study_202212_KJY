package j12_배열;

public class Array6 {

	public static void main(String[] args) {
		
		String[] names = {"박성진", "조병철","황창욱"};
		
		for(String/*타입에 객체가 되도됨*/ name : names) { //무조건 처음부터 끝까지 하나씩 꺼냄
			System.out.println(name);
			name = "김준일"; //그냥 name에 값을 넣은것이다. 배열에다 넣은게 아님!!
			//name에 names를 넣은거니까 names에 index에 직접 값을 바꿔줘야 값이 바뀐다..!!
		}
		
		
		System.out.println("=======↑====for ~ each============");
		
		//for~ each
	/*	for(타입 변수 : 배열변수(배열이나 list 형태)){
			System.out.println(변수);
		}*/
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		System.out.println("=========for ~ each============");
		
		int[] nums = {1,2,3,4,5};
		//배열 nums 를 int i 에 넣어서 출력함!!
		for(int i : nums) {
			System.out.println("i : " + i);
		}
		
		
	}
}
