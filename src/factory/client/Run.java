package factory.client;

import factory.framewrok.ConnectorFactory;
import factory.framewrok.SMTPConnector;

public class Run {
	
	public static void main(String[] args) {
		
		
		//네이버 SMTP서버에 연결해보자
	try {
		SMTPConnector naver = 
		ConnectorFactory.builder()
		.url("smtp.naver.com")
		.id("zo4870@naver.com")
		.password("1234")
		.build()
		.getConnector();
		
		naver.connect();

	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
