package strategy.client;

import strategy.framework.MemberDao;

public class Run {
	
	public static void main(String[] args) {
		
		
		//따로 상속을 하지 않아도 인터페이스만 구체적으로 구현한 뒤 매개변수로 넘겨줌으로써 템플릿 메소드 패턴의 단점을 보완함
		String userId="DEV";
		String password = new MemberDao().selectPassword(userId, new ConnectionFactory());
		
		System.out.println("비밀번호는 " + password + "입니다.");
		
	}

}
