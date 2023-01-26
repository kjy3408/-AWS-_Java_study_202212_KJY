package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Roleinsert {

	private DBConnectionMgr pool;																		//DBConnectionMgr pool로 선언
	
	public Roleinsert() {																				//Roleinsert 생성자 생성 시 DBConnectionMgr 싱글톤 생성.
		pool = DBConnectionMgr.getInstance();
	}
	
	public int saveRole(String roleName) {																//외부에서 값을 받아와 입력해주기 위한 매개변수
		int successCount = 0;																			//successCount 변수를 만들어 쿼리입력 성공 시 카운트가 증가하게끔 만들어놓음.
		
		String sql = null;																				//sql내부에 문자열 타입으로 만들어놓았기에 String으로 선언해줌.
		Connection con = null;											//DB연결용						//JDBC와 연결하기 위한 변수
		PreparedStatement pstmt = null;																	//sql을 받아오고 실행하는 용도	
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();	 		
																										//DBConnectionMgr class의 getConnection을 호출하면 sql의 서버와 연결되는 DriverManager가 들어있어 호출 시 연결됨.(연결 실패시 SQLException에러가 뜸 그래서 예외처리를 해줌)
			sql = "insert into role_mst values (0, ?)";	
			
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, roleName);																//값을 넣는 코드.(Set) [1번째 물음표에 roleName(매개변수)가 들어간다.]
						
			successCount = pstmt.executeUpdate();														//insert, update, delete (select 제외)
			
			int newKey = 0;
			
			rs = pstmt.getGeneratedKeys();													//자동완성(AI) 된 키값을 가져오겠다.
			if(rs.next()) {				//rs.next()는 무조건 한번 해줘야함.
				newKey = rs.getInt(1);	//"1"컬럼 열의 위치(rs.next()를 하게되면 다음으로 넘어간 첫번째위치)
			}
			
			System.out.println(newKey != 0 ? "새로운 키값: " + newKey : "키가 생성되지 않음");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return successCount;		
	}
	
	
	
	public static void main(String[] args) {
		
		Roleinsert roleinsert = new Roleinsert();
		
		int successCount = roleinsert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공 건수: " + successCount);
	}
}
