package TestOne;

public class CheckIfStringPalindrome {

	public static void main(String[] args) {
		String name = "Madam";
		boolean isPalindrome = true;

		int size = name.length();

		for (int i = 0; i < size; i++) {
			char a = name.charAt(i);
			char b = name.charAt(size - i - 1);
			if (a != b) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(name + " is Palindrome");
		} else {
			System.out.println(name + " is Not Palindrome");
		}

	}

}
