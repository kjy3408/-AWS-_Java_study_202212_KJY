package usermanagement.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import usermanagement.config.DBConnectionMgr;
import usermanagement.entity.RoleDtl;
import usermanagement.entity.RoleMst;
import usermanagement.entity.User;

/*
 * User"Dao"라고부름. DataAccessObject => 데이터접근용. CRUD
 */
public class UserRepository {
	
	private DBConnectionMgr pool;															//DBConnectionMgr 선언
	
	private static UserRepository instance;													//UserRepository를 싱글톤으로 선언.
	
	public static UserRepository getInstance() {
		if(instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}
	
	private UserRepository() {																//UserRepository싱글톤 생성(getInstnace 호출)시 DBConnectionMgr 싱글톤도 생성
		pool = DBConnectionMgr.getInstance();
	}
	
//========UserRepository 기본틀==================
	//Create 리턴은 int
	
	public int saveUser(User user) {														
		int successCount = 0;
	
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //AI Key값 받을려고 선언
		
		try {
			con = pool.getConnection();		//연결
			sql = "INSERT INTO user_mst VALUES (0, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);					//AI Key값이 뭔지 모르기에 해당하는 Key를 받아온다.
			
			pstmt.setString(1, user.getUsername()); //값 저장.
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());		
			
			successCount = pstmt.executeUpdate();
			
			rs = pstmt.getGeneratedKeys();														//받아온 Key값을 rs에 넣어줌.
			
			if(rs.next()) {																		//Key값이 저장되어있는 변수 rs가 
				user.setUserId(rs.getInt(1));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {			
			pool.freeConnection(con, pstmt, rs);
		}
		
		return successCount;
	}
	
	public int saveRoleDtl(RoleDtl dtl) {
		
		int successCount = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = pool.getConnection();
			
			String sql = "INSERT INTO role_dtl VALUES (0, ?, ?) ";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dtl.getRoleId());
			pstmt.setInt(2, dtl.getUserId());
			
			successCount = pstmt.executeUpdate(); //값 들어감.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
				
		return successCount;
	}
		
	public User findUserByUsername(String username) {
		
		User user = null;
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			
			sql = "SELECT\r\n"
					+ "	   um.user_id,\r\n"
					+ "    um.username,\r\n"
					+ "    um.password,\r\n"
					+ "    um.name,\r\n"
					+ "    um.email,\r\n"
					+ "    rd.role_dtl_id,\r\n"
					+ "    rd.role_id,\r\n"
					+ "    rd.user_id,\r\n"
					+ "    rm.role_id,\r\n"
					+ "    rm.role_name\r\n"
					+ "FROM\r\n"
					+ "	   user_mst um\r\n"
					+ "    LEFT OUTER JOIN role_dtl rd ON(rd.user_id = um.user_id)\r\n"
					+ "    LEFT OUTER JOIN role_mst rm ON(rm.role_id = rd.role_id)\r\n"
					+ "WHERE um.username = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, username);	//"1"번째 물음표에 username이 들어간다.
			rs = pstmt.executeQuery();		//select 한 결과를 rs(ResultSet)에 담을거다
			
			List<RoleDtl> roleDtls = new ArrayList<>();
			
			int i = 0;						//결과가 현재 3개가 나와야하는데 if를 쓰면 한줄밖에 안나옴 그래서 while문을 써줘야함.
			while(rs.next()) {				//select한 결과를 rs에 담았고 .next()가 true면 해당열에있는 값들을 가져와서 user에 넣어라.
				if(i == 0) {
					user = User.builder()
							.userId(rs.getInt(1))
							.username(rs.getString(2))
							.password(rs.getString(3))
							.name(rs.getString(4))
							.email(rs.getString(5))
							.build();
				}
				
				RoleMst roleMst = RoleMst.builder()
						.roleId(rs.getInt(9))
						.roleName(rs.getString(10))
						.build();
				
				RoleDtl roleDtl = RoleDtl.builder()
						.roleDtlId(rs.getInt(6))
						.roleDtlId(rs.getInt(7))
						.userId(rs.getInt(8))
						.roleMst(roleMst)
						.build();
				
				roleDtls.add(roleDtl);
				
				i++;
			}
			
			if(user != null) {
				user.setRoldDtls(roleDtls);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			pool.freeConnection(con, pstmt, rs);
			
		}
		
		return user;
	}
	
	public User findUserByEmail(String email) {
		User user = null;
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			
			sql = "SELECT\r\n"
					+ "	   um.user_id,\r\n"
					+ "    um.username,\r\n"
					+ "    um.password,\r\n"
					+ "    um.name,\r\n"
					+ "    um.email,\r\n"
					+ "    rd.role_dtl_id,\r\n"
					+ "    rd.role_id,\r\n"
					+ "    rd.user_id,\r\n"
					+ "    rm.role_id,\r\n"
					+ "    rm.role_name\r\n"
					+ "FROM\r\n"
					+ "	   user_mst um\r\n"
					+ "    LEFT OUTER JOIN role_dtl rd ON (rd.user_id = um.user_id)\r\n"
					+ "    LEFT OUTER JOIN role_mst rm ON (rm.role_id = rd.role_id)\r\n"
					+ "WHERE um.email = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, email);				//"1"번째 물음표에 username이 들어간다.
			rs = pstmt.executeQuery();				//select 한 결과를 rs(ResultSet)에 담을거다
			
			List<RoleDtl> roleDtls = new ArrayList<>();
			
			int i = 0;								//결과가 현재 3개가 나와야하는데 if를 쓰면 한줄밖에 안나옴 그래서 while문을 써줘야함.
			while(rs.next()) {						//select한 결과를 rs에 담았고 .next()가 true면 해당열에있는 값들을 가져와서 user에 넣어라.
				if(i == 0) {
					user = User.builder()
							.userId(rs.getInt(1))
							.username(rs.getString(2))
							.password(rs.getString(3))
							.name(rs.getString(4))
							.email(rs.getString(5))
							.build();
				}
				
				RoleMst roleMst = RoleMst.builder()
						.roleId(rs.getInt(9))
						.roleName(rs.getString(10))
						.build();
				
				RoleDtl roleDtl = RoleDtl.builder()
						.roleDtlId(rs.getInt(6))
						.roleDtlId(rs.getInt(7))
						.userId(rs.getInt(8))
						.roleMst(roleMst)
						.build();
				
				roleDtls.add(roleDtl);
				
				i++;
			}
			
			if(user != null) {
				user.setRoldDtls(roleDtls);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
	}
	
	
}
