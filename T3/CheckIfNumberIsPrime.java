package TestOne;

public class CheckIfNumberIsPrime {

	public static void main(String[] args) {

		int n = 11;
		boolean isPrime = true;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not Prime (Consugate number)");
		}

//		System.out.println(" isPrime " + isPrime);

	}
}
