package J13_상속.casting2;

public class Main {
	
	public void dd() {
		
		if("dd".equals("dd")){
			System.out.println("참");
		}
		
	}
	
	public static void main(String[] args)	{
		
		Taxi taxi = new Taxi();
		Subway subway = new Subway();
		
//		Transportation transportation = new Transportation();
//		Taxi ti = (Taxi) transportation; //다운캐스팅 되지않음.  => ClassCastException 에러뜸.
//		
//		Transportation transportation1 = taxi;
//		Subway s1 = (Subway) transportation1; //얘도 안됨.
//		
//		//즉, 업캐스팅을 해야 다운캐스팅이 된다. => 다운캐스팅(원상복구)
//		Transportation transportation2 = subway;
//	
		
		Transportation[] transportations = new Transportation[6];
	
		transportations[0] = taxi;
		transportations[1] = subway;
		transportations[2] = taxi;
		transportations[3] = subway;
		transportations[4] = taxi;
		transportations[5] = subway;
//		
//		for(int i = 0; i < transportations.length; i++) {
//			Taxi tx = (Taxi) transportations[i]; //조건체크를 해야한다.
//			transportations[i].go(); 
//			tx.checkTaxiNumber(); 
//		}
//		
//		
//		for(Transportation t : transportations) {//foreach사용
//			t.stop();
//		}
		
		
		for(int i = 0; i < transportations.length; i++) {
			if(transportations[i] instanceof Taxi) {//배열을 돌리기위해선 instanceof 키워드를 사용해 해당 객체인지 확인 후 해당 클래스만 변환시킬 수 있다.
				Taxi tx = (Taxi) transportations[i]; //조건체크를 해야한다.
				tx.checkTaxiNumber();
				
			}else if(transportations[i] instanceof Subway) {
				Subway sb = (Subway) transportations[i];
				sb.checkRoute();
				
			}
			
			transportations[i].go(); 
	}
		
		
		
		
		//택시나 지하철을 탈때 노선확인 후 타고싶다.
		
	}
	
}
