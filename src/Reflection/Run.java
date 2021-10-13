package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
	
	public static void main(String[] args) {
		
		
		
		Woman m = new Woman();
		try {
			
			Method[] methods = m.getClass().getDeclaredMethods();
			
			for(Method method : methods) {
				System.out.println("메소드 이름: " + method.getName());
				
			}
			
			//메소드명으로 private 메소드 실행시키기
			Method play = m.getClass().getDeclaredMethod("play");
			play.setAccessible(true);
			play.invoke(m);
			
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
