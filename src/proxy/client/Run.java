package proxy.client;

import proxy.framework.MyAspect;

public class Run {
	
	public static void main(String[] args) {
		
		
		//의존성 주입. 내 Man객체를 MyAspect에 넣어버린다.
		new MyAspect(new Man()).develop();
		System.out.println("=================");
		new MyAspect(new Woman()).develop();
		
		
	}
	

}
