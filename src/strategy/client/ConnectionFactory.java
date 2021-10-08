package strategy.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import strategy.framework.ConnectionMaker;


//ConnectionMaker를 구현한 클라이언트의 클래스
public class ConnectionFactory implements ConnectionMaker{

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
