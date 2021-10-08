package templateCallback.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import templateCallback.framework.ConnectionMaker;
import templateCallback.framework.MemberDao;

//자바 람다
//Functional Interface : 추상메서드가 하나만 존재하는 인터페이스
//						인터페이스 위에 @Functional Interface 어노테이션을 작성
//Functional Interface의 추상메서드는 화살표 함수 형태로 오버라이드 가능 

//* 자바의 화살표 함수도 매개변수의 타입을 생략 할 수 있음
//* 화살표 함수의  body block을 생략할 경우 ;(세모콜론)도 생략
//* 매개변수가 하나만 있는 경우 () 생략 가능
//* return문 밖에 없는 경우, 메서드 body block과 return문 생략
//* 메서드 구문이 1줄인 경우 메서드 body의 block을 생략 
// => 있으면 외려 에러남


public class Ramda {
	
	public static void main(String[] args) {
		
		
		//따로 상속을 하지 않아도 인터페이스만 구체적으로 구현한 뒤 매개변수로 넘겨줌으로써 템플릿 메소드 패턴의 단점을 보완함
		String userId="DEV";
		String password = new MemberDao().selectPassword(userId , (a,b)-> {
				//화살표 함수 = 익명함수
				//화살표 함수를 쓰려면 해당 클래스에 메서드가 1개만 있어야함.
				Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BM" , "1234");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return conn;
			});
		
		System.out.println("비밀번호는 " + password + "입니다.");
		
	}

}
