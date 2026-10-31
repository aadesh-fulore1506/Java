package array;

public class ToggleElement {

	public static void main(String[] args) {

		//Toggle elements in an array/list (e.g., swap first and last elements)
		
		int arr[] = {10, 20, 30, 40, 50};
		
		int tem = arr[0];
		arr[0] = arr[arr.length -1];
		arr[arr.length -1] = tem ;
		
		for(int i=0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
