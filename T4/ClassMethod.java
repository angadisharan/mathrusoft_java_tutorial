package TestOne;

public class ClassMethod {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int sum = addNumbers(a, b);

		System.out.println(a + " + " + b + " = " + sum);

		// for (int i = 1; i <= 10; i++) {
		// printNumbers(i);
		// System.out.println("================= ");
		// }

		// printNumbers(1);
		// System.out.println("================= ");
		// printNumbers(2);
		// System.out.println("================= ");
		// printNumbers(3);
		// System.out.println("================= ");
		// printNumbers(4);

		// for (int i = 0; i < 1; i++) {
		// System.out.println("Number " + i);
		// }
		// System.out.println("================= ");
		// for (int i = 0; i < 2; i++) {
		// System.out.println("Number " + i);
		// }
		// System.out.println("================= ");
		// for (int i = 0; i < 3; i++) {
		// System.out.println("Number " + i);
		// }
		// System.out.println("================= ");
		// for (int i = 0; i < 4; i++) {
		// System.out.println("Number " + i);
		// }
		// System.out.println("================= ");

	}

	private static void printNumbers(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("Number " + i);
		}
	}

	// What is method

	private static int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
