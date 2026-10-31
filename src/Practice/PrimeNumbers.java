package Practice;

public class PrimeNumbers {

	public static void main(String[] args) {

		int number = 13 ;
		boolean isPrime = true ;
		
		if(number%2 == 0) {
			isPrime = false;
		}
		if(isPrime == true) {
			System.out.println("Prime");
		}else {
			System.out.println("not");
		}
		
		//print prime number upto 100
		int num = 100 ;
		
		for(int i=2 ; i <= num ; i++) {
			boolean isPrime1 = true ;
			for(int j=2 ; j <= i/2 ; j++) {
				if(i%j == 0) {
					isPrime1 = false ;
					break ;
				
				}
			}
			if(isPrime1) {
				System.out.print(i + " ");
			}
		}
		
		
	}
}
