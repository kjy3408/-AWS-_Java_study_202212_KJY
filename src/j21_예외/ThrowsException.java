package j21_예외;
	
import java.util.Arrays;
import java.util.List;
import java.util.Random;
	
public class ThrowsException {									//RuntimeException은 uncheckedException이기에 빨간줄 안뜸.
																//Exception은 checkedException이기에 빨간줄 뜸.
	public static void printList(List<String> list, int size) throws Exception {//이 메소드를 실행시킬려면 무조건 예외처리를 해야돼! 라고 명시해놓는것.(예외처리 하지 않으면 절대 실행되지 않는 프로그램으로 만듬)
	
		for(int i = 0; i < size; i++) {
			System.out.println("[" +  i + "]" + list.get(i));
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		String[] names = {"김수현", "이종현", "박성진", "김동민"};
		
		try {
			
			printList(Arrays.asList(names), 5);
		} catch (Exception e) {
			e.printStackTrace();//얘가 예외(에러)출력함. (어떤예외인지 출력해줌)
		}finally {//무조건실행 이유불문 => 예외처리를 할 때 다른 예상치 못한 Exception이 생겼을 시 무조건 실행이기에 사용한다.. 임시저장과 같은 로직을 작성.
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 정상종료");
		
		//예외가 생성한 곳이 아닌 호출한 곳에서 예외가 일어나게 하는것(예외를 미루다.) => throws Exception

		
		try {	//finally실행 확인을 위한 로직
 			throw new ClassCastException();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();//얘가 예외(에러)출력함. (어떤예외인지 출력해줌)
		}finally {//무조건실행 이유불문 => 예외처리를 할 때 다른 예상치 못한 Exception이 생겼을 시 무조건 실행이기에 사용한다.. 임시저장과 같은 로직을 작성.
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 정상종료");

	
	
	}
	
}	