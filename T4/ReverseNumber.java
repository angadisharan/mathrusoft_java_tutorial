package TestOne;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123422;
		int reversedNumber = 0;
		while (number > 0) {
			int lastDigit = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
		}
		System.out.println(" reverse of number is " + reversedNumber);

	}

}
