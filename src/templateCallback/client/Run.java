package templateCallback.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import templateCallback.framework.ConnectionMaker;
import templateCallback.framework.MemberDao;


//템플릿 콜백패턴: 인터페이스를 따로 클래스로 만들지 않고, 내부클래스로 구현하는 것
public class Run {
	
	public static void main(String[] args) {
		
		
		//따로 상속을 하지 않아도 인터페이스만 구체적으로 구현한 뒤 매개변수로 넘겨줌으로써 템플릿 메소드 패턴의 단점을 보완함
		String userId="DEV";
		String password = new MemberDao().selectPassword(userId, new ConnectionMaker() {
			
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
		});
		
		System.out.println("비밀번호는 " + password + "입니다.");
		
	}

}
