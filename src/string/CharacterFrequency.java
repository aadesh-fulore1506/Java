package string;

public class CharacterFrequency {

	public static void main(String[] args) {

		String str = "programming";
		
		for(int i=0; i < str.length();i++) {
			int count = 0;
			
			for(int j=0; j< str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
			      System.out.print(str.charAt(i)); 
			      count ++ ;
				}
			}
			System.out.println(": " + count);
		}
		
	}

}
