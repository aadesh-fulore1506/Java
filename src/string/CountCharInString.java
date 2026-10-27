package string;

public class CountCharInString {

	public static void main(String[] args) {

		String s = "Java Programing for Automation" ;
		
		int totalLenght = s.length();
		
	int lenghtAfterRemoveA =	s.replaceAll("a", "").length();
	
	int count = totalLenght -lenghtAfterRemoveA ;
	System.out.println(count);
	
	}

}
