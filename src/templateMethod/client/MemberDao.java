package templateMethod.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import templateMethod.framework.dao.AbstractMemberDao;

//Abstract MemberDao abstract 메소드 완성
public class MemberDao extends AbstractMemberDao{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BM" , "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
