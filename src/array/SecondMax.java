package array;

public class SecondMax {

	public static void main(String[] args) {

		int arr[] = { 10, 50, 20, 80, 30 };
		int max = 0;
		int secondMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}

		}

		System.out.println(secondMax);

	}

}
