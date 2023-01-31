package j24_람다;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda2 {

	public static void main(String[] args) {
		
		// 1. Runnable - run() : 매개변수 X  반환 X
		Runnable a = () -> System.out.println("실행");			//a는 1개만 실행하기에 중괄호 생략./ 매개변수없으므로 비워둠
		Runnable b = () -> {
			System.out.println("여러");							//b는 2개 이상이기에 중괄호 생략불가.
			System.out.println("명령");
			System.out.println("실행");
		};
		
		a.run();
		b.run();
		
		System.out.println();
		
		// 2.supplier<T> - T get() [getter생각하면됨] : 매개변수X 반환O
		Supplier<LocalDate> c = () -> LocalDate.now(); //return 생략 (LocalDate.now()를 바로 리턴)
		Supplier<String> d = () -> {
			LocalDate now = LocalDate.now();
			return now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 DD일"));
		};
		
		System.out.println(c.get());
		System.out.println(d.get()); 
		
		System.out.println();
		
		//3. Consumer<T> - void accept(T t) : 매개변수 O 반환 X
		Consumer<String> e = name -> System.out.println("이름: " + name);
		Consumer<String> f = name -> {
			System.out.println("이름: " + name);
			System.out.println("오늘 날짜: " + d.get()); //밖에있는 d.get()사용가능.
		};

		e.accept("김똥개");
		f.accept("김고양이");
		
		System.out.println();
		
		//메소드 참조 표현식([인스턴스]::[메소드명 또는 new])
		Consumer<String> g = System.out :: println; 
		g.accept("Consumer출력");
		
		System.out.println();
		
		List<String> names = new ArrayList<>();
		names.add("김동민");
		names.add("김두영");
		names.add("장진원");
		names.add("조병철");
				
		Consumer<String> h = name -> System.out.println("Consumer이름: " + name + "님");
		names.forEach(h);
		
		System.out.println();
		
		names.forEach(name -> System.out.println("forEach이름: " + name + "님"));
		
		System.out.println();
		
		names.forEach(name -> {
			System.out.println("이름을 출력합니다");
			System.out.println("이름: " + name);
			System.out.println();
		});
	
		//Map forEach
		Map<String, String> userMap = new HashMap<>();
		userMap.put("username", "aaa");
		userMap.put("password", "1234");
		
		System.out.println("====123123123");
		//entry로 바꾸지 않아도 바로 꺼낼수있음.!!!!!!!!!!!!!!
		userMap.forEach((key, value) -> {
			if(key.equals("username")) {
				value = "bbb";
			}
			System.out.println(key);
			System.out.println(value);
		});
		
		
		
		int num = 90;
		
		//위처럼 쓰지 않으면 이렇게 써야됨. (entry로 변환하여 하나씩 꺼내줘야함)
		for(Entry<String, String> entry : userMap.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println(names);
		}
		
		System.out.println("========================");
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("1", 1);
		map1.put("2", 2);
		map1.put("3", 3);
		
		
		List<String> list = new ArrayList<>();
		
		map1.forEach((num1, number ) -> {
			System.out.println(num1);
			System.out.println(number);
			
			list.add(num1);
			
		});
		System.out.println("dd"+list);
		
		
//		System.out.println();
//		for(Entry<String, Integer> entry : map1.entrySet()) {
//			System.out.println(num= 100);
//		
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		
		
		
	
	
	}
	
}
