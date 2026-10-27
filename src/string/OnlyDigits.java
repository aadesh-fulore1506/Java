package string;

public class OnlyDigits {

	public static void main(String[] args) {

		String str = "12q456";
		boolean isDigit = true;

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		if (isDigit == true && !str.isEmpty()) {
			System.out.println("String contains only digits");
		} else {
			System.out.println("String not contains only digits");
		}

	}

}
