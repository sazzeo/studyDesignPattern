package factory.framewrok;

import java.util.Date;

public class DaumMailConnector extends SMTPConnector {

	
	//직접 외부에서 생성자 생성 못하게 protected로 선언 
	//protected: 자식 생성자 혹은 같은 패키지에서만 사용 가능
	protected DaumMailConnector(String url, String id, String password, Date connectTime) {
		super(url, id, password, connectTime);
	}

	@Override
	public void connect() {
		System.out.println("다음 SMTP 서버와 연결에 성공했습니다.");
	}


	
	

}
