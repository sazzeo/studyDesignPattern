package templateMethod.framework.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//템플릿 패턴 : 내가 구현할 부분빼고 나머지는 추상메소드로 만들어 사용자에게 맡김
public abstract class AbstractMemberDao {
	
	
	public String selectPassword(String userId) {
		
		String password = "";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = getConnection();
					
					
			String query = "select password from member where user_id = ?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			rset = pstm.executeQuery();
			
			if(rset.next()) {
				password = rset.getString("password");
			}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		return password;
		
	}
	
	
	public abstract Connection getConnection() ;
		
		

}
