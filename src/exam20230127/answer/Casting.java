package exam20230127.answer;

public class Casting {

	public static void main(String[] args) {
		Program[] programs = new Program[2];			//크기가 2인 배열생성
		programs[0] = new Java();						//해당 인덱스에 Java라는 class를 생성하여 넣음.
		programs[1] = new C();
		
		for(int i = 0; i < programs.length; i++) {
			programs[i].develop();						//programs(배열)에서 각 인덱스에 있는 객체를 뽑아냄
			if(programs[i].getClass() == Java.class) {	//if문을 사용하여 해당 인덱스의 객체가 해당 class(Java)인지 비교.
				Java java = (Java)	programs[i];		//true라면  UpCasting되어있는 Java class를 DownCasting해줌.
				java.garbageCollection();				//DownCasting한 후 해당 메소드 호출.(해당 메소드는 Override되어있지 않기때문에 DownCasting을 해줘야 호출가능함.)
			}else if(programs[i].getClass() == C.class) {	
				C c = (C) programs[i];
				c.defineStructure();
			}
		}
	}
	
	//Object class의 getClass/ .class를 사용하여 두 객체의 UpCasting여부를 확인한 뒤 true라면 DownCasting하여 값을 출력
	
	
	//해당 배열의 i번째 인덱스가 해당 객체인지 확인 후 DownCasting을 해주기 위한 if문.
}
