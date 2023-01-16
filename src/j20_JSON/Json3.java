package j20_JSON;

import com.google.gson.Gson;

public class Json3 {

	public static void main(String[] args) {
		
		Gson gson = new Gson();//Gson이라는 라이브러리의 기능을 쓰고싶을때 (쓰기위해서 생성)
		//static으로 쓸거냐, 멤버를 쓸거냐.
		
//		System.out.println(Integer.valueOf("100") + 50);
//		System.out.println(Integer.parseInt("100") + 50);
		
		gson.toJson(null);					// Object -> json
		gson.fromJson("", Object.class);	// json -> Object
	}
}
