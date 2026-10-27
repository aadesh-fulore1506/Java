package numbers;

public class ReversePalindromeNumber {

	public static void main(String[] args) {
		
		int number = 16461 ;
		
		int original = number ;
		
	     int rev = 0;

	        while (number != 0) {
	            int digit = number % 10; // return 6  5 4
	            rev = rev * 10 + digit; // return 6   65 654
	            number = number / 10; // return 12345  1234 123
	        }

	        System.out.println("Reversed number: " + rev);
	        
	       if(original == rev) {
	    	   System.out.println("number is palindrome" );
	       }else {
	    	   System.out.println("number is not palindrome");

	       }
	       
	       System.out.println(number + "  " + rev + "  "+ original);

	}

}
