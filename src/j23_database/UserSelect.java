package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import usermanagement.entity.User;

public class UserSelect {

	private DBConnectionMgr pool = null;
	
	public UserSelect() {
		pool = DBConnectionMgr.getInstance(); //튜브대여소는 여러개면안되고 하나이기에 싱글톤으로 생성.
	}
	
	public User findUserByUsername(String username) {
		User user = null; //못찾으면 null값을 리턴해준다.
			
		//database에서 조회.
		Connection con = null; //연결에 필요한 변수선언
		PreparedStatement pstmt = null; //데이터 가져옴
		ResultSet rs = null; //결과를 담음
			
		
		try {
			
			con = pool.getConnection(); //연결해줌.
			
			String sql = "SELECT user_id, username, password, name, email FROM user_mst WHERE username = ?";
			pstmt = con.prepareStatement(sql); //connection안에 생성.
			pstmt.setString(1, username);
			
			rs = pstmt.executeQuery(); //select는 Query, 나머지는 Update (return type이 ResultSet임. 그렇기에 변수 rs에 담아줌.)
			
			if(rs.next()) {									//rs.next()는 boolean 타입임.
				user = User.builder()						//user객체에 가져온 값들을 담아주고 담긴 user는 호출한곳으로 리턴해줌.
						.userId(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.build();
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
			
			
		return user; //찾으면 찾은 user를 리턴해준다.
	}
	
	
	public static void main(String[] args) {
		
		UserSelect userSelect = new UserSelect(); //메소드 실행을 위한 UserSelect객체 생성
		
		User user = userSelect.findUserByUsername("aaa"); //생성 후 findUserByUsername메소드 호출
		
		System.out.println(user);
		
	}
}
