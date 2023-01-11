package j16_Objdect;

class Test{ //public 작성 불가. 내부에서만 쓰는 class이다. (내부class는 아님) 패키지안에서만 꺼내 쓸 쑤 있음.
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "생성");
	}
	
	@Override //소멸이 됐을때 실행됨(java는 소멸자가 없기때문에 스스로 소멸 시킬 수 없음)
	protected void finalize() throws Throwable {//소멸되면 안되는것이 있을때 사용
		System.out.println(num + "객체 소멸");
	}
	
}

//finalize는 객체 소멸에 사용한다(생성된 객체를 메모리에서 내리는게 소멸)
public class ObjectFinalize {//public이 있으면 외부에서 접근할 수 있게끔 접근지정해주는것임. 

	
	public static void main(String[] args) {
		
		Test test = null;
	
		for(int i = 0;i < 10; i++) {
			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			test = new Test(i);
			
			test = null;
			
			System.gc();//가비지컬랙터 실행해라. 라는 강제명령(호출)//바로실행되진않음 JVM이 여유가있을때 실행됨.
		}
	
	
	}
	
}
