package j12_배열.복습;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User{
	private String username;
	private String name;

}

	

public class Array2 {

	public static void main(String[] args) {
		User user1 = new User("aaa", "1234");
		User user2 = new User("bbb", "2222");
		User user3 = new User("ccc", "3333");
		//위나 아래나 같은거임.
		
		User[] users = new User[3];
		users[0] = new User("aaa", "1234");
		users[1] = new User("bbb", "2222");
		users[2] = new User("ccc", "3333");
		
		User[] users1 = new User[] {
				new User("aaa", "1234"),
				new User("bbb", "2222"),
				new User("ccc", "3333")
		};
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("users: " +users[i]);
		}
		
		System.out.println("\n========for========");
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("users1.get~~(): " + users[i].getUsername());
		}
		
		System.out.println("\n========forEach사용========");
		
		for(User u : users) {
			System.out.println(u.getName());
		}
		
		System.out.println("\n========배열을 List로 변형========");
		
		List<User> userList = Arrays.asList(users);	//배열을 list로 변형(출력형태잘보기)
		
		System.out.println(userList);
		
		System.out.println(userList.get(1).getUsername());
		
		
		users[1].setUsername("1234"); //해당 index에 있는 객체의 멤버변수를 바꾸고싶을때.
		
		System.out.println("");
		for(User us : users) {
			System.out.println(us);
		}
		
//		int[] num = new int[] {1,2,3};
		
//=======================================================================
	
		
		List<String> list = Arrays.asList("일","이", "이", "삼", "사","일");
		
		
	
		
		Set<String> set = new HashSet<String>();
		
		set.addAll(list);
				
		List<String> list1 = new ArrayList<>();
		
		list1.addAll(set);
		
		for(String a : set){
			System.out.println(a);
		}
		
		for(int i = 0 ; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		Object[] objs = list1.toArray();
		
		String[] str = new String[objs.length];
		
		for(int i = 0; i < objs.length; i++) {
			str[i] = (String) objs[i];
			System.out.println("0"+str[i]);
		}
		
		Arrays.sort(str, Collections.reverseOrder());
		
		list1 = Arrays.asList(str);
		
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println("dd"+list1.get(i));
		}
		
		
		
		
		//Array => list : list.toArray(); => 바뀔때 Object 타입으로 바뀜, 값을 하나씩 다 꺼낸 후 DownCasting해줘야함.
		//list => set
		//set = > list
		//list + set => map
		
		//map => list , set
		
		
		}
		
}
