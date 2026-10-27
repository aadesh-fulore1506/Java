package array;

import java.util.ArrayList;


public class SumOfAllElements {

	
	public static void main(String[] args) {
	
		int[] arr = {10,20,30,40,50,21,31};
		int sum = 0 ;
		ArrayList<Integer> even = new ArrayList<>()  ;
		ArrayList<Integer> odd =  new ArrayList<>()  ;

		
		
		for(int i=0 ; i<arr.length ; i++) {
			
			sum = sum + arr[i];
			int digit = arr[i];
			if(digit%2 == 0) {
				even.add(digit);
			}else {
				odd.add(digit);
			}
		}
		
		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);


	}

}
