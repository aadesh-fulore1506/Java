package numbers;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 183;
		int original = number ;
		int sum = 0 ;
		
		while(number !=0) {
			int digit = number%10 ;
		     sum = sum + (digit*digit*digit);
		     number = number/10 ;
			
		}
		
		if(sum == original) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("not an Armstrong Number");
		}
	}

}
