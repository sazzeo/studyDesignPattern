package factory.framewrok;

import java.util.Date;

public class GoogleMailConnector  extends SMTPConnector  {

	
	//부모클래스에 매개변수 없는 생성자가 없으면 반드시 상속해야함. 
	protected GoogleMailConnector(String url, String id, String password, Date connectTime) {
		super(url, id, password, connectTime);
	}

	@Override
	public void connect() {
		System.out.println("구글 SMTP서버와 연결에 성공했습니다.");
	}

}
