package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
//Entity class : 객체의 정보만 있는 class

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString


//@RequiredArgsConstructor //필수생성자(final 변수있을떼)
//@NoArgsConstructor //기본생성자
@AllArgsConstructor //전체생성자
@Data //getter,setter,EqualsAndhashCode,ToString 합친것
//필요한거 골라서 사용하면됨.
public class Student {
	//@Getter : 해당 변수만 사용하고싶다면 변수 위에다 어노테이션 하면됨.
	private String name; //이름
	private int year; //학년
//	private final String ADDRESS;
}
