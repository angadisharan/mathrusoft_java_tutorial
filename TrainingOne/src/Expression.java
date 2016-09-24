public class Expression {
	public static void main(String[] args) {
		// Operators in Java +, -, *, /, % etc

		int a, b;
		int aditionResult;
		int substractionResult;
		int multiplicationResult;
		int divisionResult;

		// Assign values to a and b
		a = 8;
		b = 2;

		aditionResult = a + b;
		System.out.println(a + " + " + b + " = " + aditionResult);

		substractionResult = a - b;
		System.out.println(a + " - " + b + " = " + substractionResult);

		multiplicationResult = a * b;
		System.out.println(a + " * " + b + " = " + multiplicationResult);

		divisionResult = a / b;
		System.out.println(a + " * " + b + " = " + divisionResult);

		System.out.println("__________ % operator______________");

		int p = 99;
		int q = 5;
		int modResult = p % q;

		System.out.println(p + " % " + q + " = " + modResult);

		System.out.println("___________________________________");

		// Pre increment operator
		int x = 10;
		x++; // x = x + 1
		System.out.println("Post incremented value x " + x);

		++x; // x = x + 1
		System.out.println("Post incremented value x " + x);

		// re assign x to 10
		x = 10;
		b = x++; // this is equivalent to b = x; and x++;
		System.out.println(" x = " + x + " , b = " + b);

		// re assign x to 10
		x = 10;
		b = ++x; // This is equivalent to ++x; b = x;
		System.out.println(" x = " + x + " , b = " + b);

	}
}
