package numbers;

public class SumOfDigits {

	public static void main(String[] args) {
	
		int num = 468291 ;
		int sum = 0 ;
		int count = 0 ; 
		
		while(num>0){
			count++ ;
			int digit = num%10 ;
			sum = sum + digit ;
			num = num/10 ;
		}

		System.out.println(sum);
		System.out.println(count);

	}

}
