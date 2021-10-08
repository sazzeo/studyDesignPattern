package factory.framewrok;

import java.util.Date;

//protected로 선언 된 다음, 구글, 네이버 생성자를 생성하기 위한 클래스
public class ConnectorFactory {

	
	private String url;
	private String id;
	private String password;
	private Date connectTime;
	
	
	
	
	//빌더 패턴 기본생성자
	public ConnectorFactory(ConnectorFactoryBuilder builder) {
		
		this.url = builder.url;
		this.id = builder.id;
		this.password = builder.password;
		this.connectTime = new Date();
		
		
	}
	
	
	
	public static ConnectorFactoryBuilder builder() {
		
		return new ConnectorFactoryBuilder();
		
	}
	
	
	//내부 클래스
	public static class ConnectorFactoryBuilder{
		private String url;
		private String id;
		private String password;
		
		public ConnectorFactoryBuilder url(String url) {
			this.url = url;
			return this;
			
		}
		
		public ConnectorFactoryBuilder id(String id) {
			this.id = id;
			return this;
			
		}
		
		public ConnectorFactoryBuilder password(String password) {
			this.password = password;
			return this;
			
		}
		
		public ConnectorFactory build() {
			return new ConnectorFactory(this);
			
		}
		
		
	}
	
	
	public SMTPConnector getConnector() throws Exception {
		
		
		if(url.equalsIgnoreCase("smtp.naver.com")) {
			return new NaverMailConnector(url, id, password, connectTime);
		}else if(url.equalsIgnoreCase("smtp.daum.net")) {
			return new DaumMailConnector(url, id, password, connectTime);
		}else if(url.equalsIgnoreCase("smtp.google.com")) {
			return new GoogleMailConnector(url, id, password, connectTime);
		}else {
			throw new Exception("잘못된 smtp 호스트를 입력하였습니다.");
		}
			
		
	}
	
	
}
