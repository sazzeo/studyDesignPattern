package templateCallback.framework;

import java.sql.Connection;

@FunctionalInterface //이 클래스의 메소드를 화살표 함수를 쓰겠다는 의미 : 추상 메소드를 딱 1개만 만들 수 있음.
//추상 메소드 외 다른 메소드는 있어도 상관없음.
public interface ConnectionMaker {
	
	
	
	Connection getConnection(String a, String b);

	//추상메서드만 아니면 상관없음.
	public default void test() {
		
		System.out.println("안녕");
	}
	
}
