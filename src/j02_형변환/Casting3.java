package j02_형변환;

public class Casting3 {

	public static void main(String[] args) {
		
		double kor = (int) 87.5;
		double eng = (int) 95.7;
		double math = (int) 80.5;
		
//		int total = 0;
//		double avg = 0;
		
		int total = (int) kor + (int) eng + (int) math;
		double avg = total / 3;
//		total = (int) (kor + eng + math);
//		avg = (double) total / 3;
		
		//국영수 토탈을 낼때 절삭해서 소수점 버리고 토탈 냄
		//그 토탈에다가 평균의 결과는 소수로
		
		System.out.println("점수 총 합 : " + total);
		System.out.println("평균 점수 : " + avg);
		
		//들여쓰기, 띄어쓰기 잘 사용하기. (형변환과 변수 사이 띄어쓰기, 연산자 사이에 띄어쓰기)
		//자동완성 시 띄어쓰기에 작성도 띄어쓰기로 한다.(자동완성 시켜주는 이유가 있을테니 그렇게 쓰는걸 권장)
		System.out.println((double)262/3);
	
	}
}
