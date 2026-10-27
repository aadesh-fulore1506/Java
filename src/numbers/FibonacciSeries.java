package numbers;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10 , num1 = 0 , num2 = 1 ;
				
		for( int i=1 ; i <= n ; i ++) { 
			
			int num3 = num1 + num2 ; // 2 + 3
			
			System.out.println(" " + num3); // 1 2 3 5 8 13 21 34 
			num1 = num2 ; // 2
			num2 = num3 ; // 3
			
		}
		
		//easy way 
	      int a = 0;
	        int b = 1;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print(a + " ");

	            int c = a + b;
	            a = b;
	            b = c;
	        }
	}
	

}
