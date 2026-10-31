package array;

public class MaxElement {

	public static void main(String[] args) {

	      int arr[] = {10, 50, 20, 80, 30};
	      int max = 0 ;
	      
	      for(int i=0 ; i< arr.length ; i++) {
	    	  if(arr[i] > max) {
	    		  max = arr[i] ;
	    	  }
	      }
	      System.out.println(max);
	}

}
