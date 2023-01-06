package j12_배열;

import java.util.Random;

public class Array3 {
	
	public static void main(String[] args) {
		//Random 클래스가 있다.
		Random random = new Random();
		
		int[] nums = new int[10];//공간 10개 많듬 내용은 없음

		
		//10개/ 1~10까지
		for(int i = 0; i < nums.length; i++) {//제일 아래 break;문이 실행되면 for문 실행돼서 i가 1증가함(while문이 멈춰야 실행되니 중복값이 없고 데이터를 넣었을때 비로소 i값이 1 증가함.)
			while(true) {//가장 기초 while 탐색 기법 //무한루프돌림
				boolean findFlag = true;// fineFlag = true라고 선언(이후 사용을 위한 선언)
				
				int randomNum = random.nextInt(nums.length) +1;	 // randomNum에 1~10까지 숫자 하나 랜덤으로 대입
				
				for(int j = 0; j < nums.length; j++) { //j를 0~9까지 1씩 증가
					if(nums[j] == randomNum) { // nums의 0~9까지 인덱스 속 데이터와 randomNum의 숫자가 같다면 findFlag는 flase로 바뀜
						findFlag = false; // nums 0~9까지 인덱스 속 데이터가 randomNum의 숫자가 같으면 false로 바뀜
						break;//for문을 멈춰주는 break; 같은걸 찾으면 for문 멈춤(break;없으면 같은걸 찾아도 index 끝까지 가서 멈춤
					}
				}
				
				if(findFlag) { // findFlag가 true있때 즉, nums의 데이터와 randomNum의 숫자가 같은게 없을때 실행
					nums[i] = randomNum; //nums의 각 인덱스에 randomNum을 대입하고 멈춤.
					break;// while문을 멈춰주는 break; 중복되지 않는 값을 """하나""" 찾았을때 멈춤
				}
			}//가장 기초 while 탐색 기법
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	
	
	

		
		

		
		
//		
	}//
}//
