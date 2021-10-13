package proxy;

public class Run {
	
	public static void main(String[] args) {
		
		
		//의존성 주입. 내 Man객체를 MyAspect에 넣어버린다.
		new MyAspect("proxy.Man").develop();
		System.out.println("=================");
		new MyAspect("proxy.Woman").develop();
		
		
	}
	

}
