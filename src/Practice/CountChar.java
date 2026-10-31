package Practice;

public class CountChar {

	public static void main(String[] args) {

		String str = "Hello World                   gfggds"; 
		int count = 0 ;
		str = str.replaceAll("\\s", "");
		
		for( int i=0; i<str.length();i++) {
			count ++ ;
		}
		 System.out.println(count);
		
		
	}

}
