package j12_배열;

import java.util.Arrays;

//UserRepository : 유저저장소(저장/관리) 데이터를 저장하기위한것만 가지고있음
public class J12_UserRepository {

	
	private J12_User[] userTable;

	public J12_UserRepository(J12_User[] userTable) {									//전체생성자 alt + shift + s + using field
		this.userTable = userTable; 													//외부에서 받아온 배열을 여기서 쓰고 로직이 끝난 후 다시 돌려준다.
	}
	
	public J12_User[] getUserTable() {													//배열 통채로 외부로 보내주기위한 메소드
		return userTable;																//외부에서 받아온 배열을 여기서 쓰고 로직이 끝난 후 다시 돌려준다.
	}
	
	
	
	public void saveUser(J12_User user) {												//외부로부터 user값을 받아 userTable[] 에 저장한다.
		extendArrayOne();																//새 공간 1개씩 확장
		userTable[userTable.length - 1] = user;											//이렇게 하기위해선 배열의 크기가 계속해서 늘어나야한다./ -1을 해준이유는 index는 n-1이기 때문(배열크기(n))
	}
	
	private void extendArray(int length) { //얘랑 아래 extendArrayOne랑 같은놈			//extendArray : 배열을 확장한다는 의미 몇개인지는 매개값으로 받음
		J12_User[] newArray = new J12_User[userTable.length + length]; 					//새로운 배열을 만들고 기존 배열 index의 +1씩 늘어난다.(매개값에따라 늘어나는 크기가 다름)
		transferDataToNewArray(userTable, newArray);		
		userTable = newArray;
	}

	private void extendArrayOne() {														//extendArrayOne : 배열 1개 확장 이라는 의미라 +1 만 해줌.
		J12_User[] newArray = new J12_User[userTable.length + 1]; 						//새로운 배열을 만들고 기존 배열 index의 +1씩 늘어난다.(매개값에따라 늘어나는 크기가 다름)
		transferDataToNewArray(userTable, newArray);									//transferDataToNewArray 메소드로 전달함.
		userTable = newArray;
	}
	
	private void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {		//NewArray에 oldArray의 데이터를 매개값으로 받아 집어 넣는 메소드
		for(int i = 0; i < oldArray.length; i++) {										//oldArray의 index와 같아야 똑같이 들어간다.
			newArray[i] = oldArray[i];
		}
	}
	
	//매우중요.. 탐색로직..
	public J12_User findUserByUsername(String username) {								//메소드호출 시 입력받는 값을 보내줌 여기로
		
		J12_User user = null;															//비어있는 user객체를 만든다. 리턴해주기위해
																				
		for(J12_User u : userTable) {													//반복을 돌리는데 userTable에 등록돼있는 데이터를 꺼내서 u에다가 담는다
			if(u == null) {																//만약 꺼냈는데 배열에 null이 들어있을수도있다. (null체크는 항상 해줘야한다) 없으면 에러나서 꺼져버림
				continue;																//null이면 그냥 넘어가라.
			}
			if(u.getUsername().equals(username)) {										//꺼낸 데이터가 null이 아닐 시 니가 입력한 username값이랑 getUsername(기존 데이터)의 값이랑 같냐?
				user = u;																//찾았으면 비어있는 배열에 넣어라!
				break;																	//찾았으면 멈춰라.
			}
		}
		return user;																	//찾은 값을 user에 넣어놨으니 부른곳으로 다시 돌려줘라.
	}
	
//	@Override
//	public String toString() {
//		return Arrays.toString(userTable);
//	}
	/**
	 * 기존 배열의 크기는 0이다. 이 배열에 데이터를 넣을 때마다 배열의 크기가 증가하게 만들어라.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
