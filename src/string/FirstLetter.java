package string;

public class FirstLetter {

	public static void main(String[] args) {

		String str = "Welcome To Java Automation" ;
		
		String[] words = str.split(" ");
		 for(int i=0 ; i < words.length ; i++) {
			 System.out.println(words[i].charAt(0));
		 }
	}

}
