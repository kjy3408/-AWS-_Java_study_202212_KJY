package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetStringMain {

	public static void main(String[] args) {
		
		Set<String> setStr = new HashSet<>(); //set은 HashSet 이라는 녀석을 쓴다.(hash값으로 정렬을 한다)
		List<String> listStr = new ArrayList<>();
		
		listStr.add("임나영");
		listStr.add("이강용");
		listStr.add("임나영");
		listStr.add("임나영");
		
		System.out.println(listStr);
		
		
		setStr.add("김상현");
		setStr.add("강대협");
		setStr.add("손지호");
		setStr.add("최해혁");
		setStr.add("최해혁");
		setStr.add("최해혁");
		setStr.add("최해혁");
		//중복 불가하니 list에 중복돼있는 값들을 제거해준다. list => set
		setStr.addAll(listStr);//addAll은 컬렉션 자료형이라면 다 들어갈 수 있음. (list => set)
		
		System.out.println(setStr);//hash값으로 정렬된 값으로 출력됨. !!!!!!!!!중복불가.!!!!!!!!!!!!!
		
		String searchName = "손지호";
			
		for(String name : setStr) {
			if(name.equals(searchName)) {
			System.out.println(name);
			}
		}
		
		
		//iterator 쓸줄알아야됨.
		Iterator<String> iterator = setStr.iterator();
		while(iterator.hasNext()) {
			String n = iterator.next();
			if(n.equals(searchName)) {
				System.out.println(n);
			}
		}

	
		
		
	}
}
