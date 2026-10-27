package string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABCD";
		String reverseString = "";
		
		for(int i=str.length()-1 ; i >=0 ; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reverse String is: " + reverseString);
		
		
		
		//Using character array
		char a[] = str.toCharArray();
		for(int i= str.length()-1 ; i >=0 ; i--) {
			reverseString = reverseString + a[i]  ;
		}
		System.out.println(reverseString);
	}

}
