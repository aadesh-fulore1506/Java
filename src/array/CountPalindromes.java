package array;

public class CountPalindromes {

	public static void main(String[] args) {
		// Find the number of palindromes in an array or list
		int[] arr = { 121, 123, 131, 456, 22 };

		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			int original = number;
			int rev = 0;
			while (number > 0) {
				int digit = number % 10;
				rev = rev * 10 + digit;
				number = number / 10;
			}

			if (rev == original) {
				System.out.println(arr[i]);
			}

		}

	}

}
