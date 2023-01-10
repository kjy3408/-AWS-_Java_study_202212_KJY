package J13_상속;

public class ExtendsMain {

	public static void main(String[] args) {
	
		KiaCar kiaCar = new KiaCar();
		
		
		kiaCar.setPrice(30000000);
		
		Car car = new Car();
		
		System.out.println(kiaCar);
	
		System.out.println(kiaCar.getPrice());
		
		
		System.out.println(kiaCar.discountPrice(20)); //오버라이딩 하지 않으면 부모에서 가져오고, 오버라이딩하면되면 자식에있는 메소드를 "통해서" 가져온다
	
		

	}

}
