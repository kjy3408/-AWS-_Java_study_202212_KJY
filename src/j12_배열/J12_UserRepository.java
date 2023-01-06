package j12_배열;
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
	
	private void extendArray(int length) { 												//extendArray : 배열을 확장한다는 의미 몇개인지는 매개값으로 받음
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
	
	/**
	 * 기존 배열의 크기는 0이다. 이 배열에 데이터를 넣을 때마다 배열의 크기가 증가하게 만들어라.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
