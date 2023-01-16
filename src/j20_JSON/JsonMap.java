package j20_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import j20_JSON.builder.User;

public class JsonMap {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		
		Map<String, Object> user = new HashMap<>();
		gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		
		user.put("username", "aaa");
		user.put("password", "1234");
		user.put("name", null); //serializeNulls() 얘를 넣게되면 null이 무시되지 않음. 원래는 무시됨.
		String userJson = gson.toJson(user); // (toJson : map을 Json으로)
		
	
		System.out.println("==================map=======================");
	
		System.out.println(user); //map
	
		System.out.println("\n=====================Json=====================");
		
		System.out.println(userJson);//Json
											//(Json변수 , Map.class);
		Map<String, Object> userMap = gson.fromJson(userJson, Map.class);//Json(userJson)을 다시 map으로 돌리는 방법 (fromJson : Json을 map으로)
										//(Json변수, 클래스명.class)
		User userObj = gson.fromJson(userJson, User.class);// Json을 User객체로 
		System.out.println("\n=====================Json -> User=====================");
		System.out.println(userObj); 
	
		System.out.println("\n====================Json -> map=====================");
		
		System.out.println(userMap);
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("test1", "aaa");
		jsonObject.addProperty("test2", "bbb");
		jsonObject.addProperty("test3", "ccc");
	System.out.println("\n=========================================");
		System.out.println(jsonObject);
		
		
		
	}
}
