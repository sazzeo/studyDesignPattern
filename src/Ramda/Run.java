package Ramda;

import java.util.Arrays;
import java.util.stream.Stream;

public class Run {
	
	public static void main(String[] args) {
	
		
		String[] a = { "a","b","c"};
		Stream stream = Arrays.stream(a).filter( e->{
			boolean res = e.equals("a");
			System.out.println(e + " : " + res);
			return res;
			
		});
		
		System.out.println(Arrays.toString(stream.toArray()));
		
	}

}
