package j12_배열;

public class DoubleArray1 {
	public static void main(String[] args) {
		
		int num = 0;
		
		int[] nums = new int[2];
	
		int[][] d_nums = new int[3][2];
	//잘못된 접근방식임.(기존 알고있던게 맞음)
		d_nums[0][0] = 1;
		d_nums[1][0] = 2;
		d_nums[2][0] = 3;
		
		d_nums[0][1] = 4;
		d_nums[1][1] = 5;
		d_nums[2][1] = 6;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(d_nums[j][i]);
			}
		}
		
		
		
		
		int[][] d_nums2 = new int[][] {
				{1, 2, 3}, 
				{4, 5, 6}
			};
			
	
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(d_nums2[i][j]);
			}
		}
		
		System.out.println(d_nums2[0].length); // => 3
		
		
		
		
		int[][] d_nums3 = new int[][] {{1, 2, 3}, {5, 6}};
		System.out.println();
		for(int i = 0; i < d_nums3.length; i++) {
			for(int j = 0; j < d_nums3[i].length; j++) {
				System.out.println(d_nums3[i][j]);
			}
		}
		
		
		
	}
	
}

