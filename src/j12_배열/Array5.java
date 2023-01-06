package j12_배열;

public class Array5 {

	//데이터를 넣을 때마다 배열의 크기가 알아서 커지는 배열.
	
	
	//하나의 메소드를 다 할수 있지만 해당 메소드명이 무슨 동작을 하는지 알수있게 해야한다.(메소드이름을 보고 어떤 동작을 하는지 확신을 가지게 작성해야한다). => 클린코드(코드가 길어져도 이렇게 해야됨)
	//=>메소드명 길어도 됨
	private static void transferArray(int[] oldArray, int[] newArray) {//기존 배열들을 받음
		for(int i = 0; i < oldArray.length; i++) {//oldArray의 배열개수만큼 계속해서 newArray의 배열크기를 늘려줌
			newArray[i] = oldArray[i]; //기존배열의 값을 새로운 배열로 계속 옮겨줌.
		}
	}
	
	private static int[] addArrayLength(int[] array) {//addData 기존 배열 그대로 전달
		int[] newArray = new int[array.length +1];//새로운 배열 만듬(newArray는 새로운 배열) 기존 array배열보다 +1된 newArray를 만듬.	
		transferArray(array, newArray); //(기존배열과 새배열을 transferArray로 전달함)
		return newArray;
	}
	
	public static int[] addDate(int[] array, int data) {//배열과 추가데이터를 매개값으로 받는다
		int[] newArray = addArrayLength(array);//array의 배열을 추가하는 역할을 함.(addARrayLength의 리턴값을 담는 newArray 배열)
		newArray[array.length] = data;
		return newArray;
	}
	
	public static void main(String[] args) {//main메소드에서 쓰지않는 메소드는 private로 숨긴다.(캡슐화) => 
			
		
		int[] nums = new int[0];
		
		nums = addDate(nums, 1); //add데이터에 nums배열에 1을 넣고싶다.
		nums = addDate(nums, 2);
		nums = addDate(nums, 3);
		nums = addDate(nums, 4);
		nums = addDate(nums, 5);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		//결합도는 낮고 응집도는 높아야한다.
	}
		
}
