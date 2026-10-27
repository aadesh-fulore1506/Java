package numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		// check the number is prime or not
		int number = 5;
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("not Prime");
		}

		// print prime numbers
		int num = 100;
		int temp = 0;
		for (int i = 2; i <= num; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					temp = temp + 1;
				}
			}

			if (temp == 0) {
				System.out.println(i);
			} else {
				temp = 0;
			}

		}

		// more easy way
//			 This loop checks whether the current number i is divisible by another number.
//			 - int j = 2 — starts checking from 2.
//			 - j <= i / 2 — checks up to half of i.
//			 - j++ — checks the next possible divisor.
//			 For example, if i = 10, then i / 2 = 5, so j checks 2, 3, 4, and 5.
//
//			 We do not need to check j = 1 because every number is divisible by 1. We do not check j = i because every number is divisible by itself.

		for (int i = 2; i <= 100; i++) {
			boolean isPrime1 = true;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime1 = false;
					break;
				}
			}

			if (isPrime1) {
				System.out.println(i);
			}
		}

	}
}
