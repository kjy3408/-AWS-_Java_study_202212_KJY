package j17_스태틱;

public class CarMain {
	
	public static void main(String[] args) {

//		Car[] car = new Car[5];
//		car[0] = new Car("산타페");
//		car[1] = new Car("아반떼");
//		car[2] = new Car("소나타");
//		car[3] = new Car("그랜저");
//		car[4] = new Car("제네시스");
//		
//		for(Car c : car) {
//			System.out.println(c);
//		}
		//배열변수명 car"s" 
		Car[] cars = new Car[5];
		cars[0] = new Car("산타페");
		cars[1] = new Car("아반떼");
		cars[2] = new Car("소나타");
		cars[3] = new Car("그랜저");
		cars[4] = new Car("제네시스");
		
		for(Car car : cars) {
			System.out.println(car);
		}
		
	

	}

}
