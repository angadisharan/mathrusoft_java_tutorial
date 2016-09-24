public class TypeConversion {

	public static void main(String[] args) {

		int a = 20;
		float b = a; // NO Error because a int can be converted to the float
		System.out.println(" value of a " + a);
		System.out.println(" value of b " + b);

		// a = b; // Compilation Error because, we are converting upper cast to
		// lower
		// Still we can convert a float to int by type convertion

		b = 22.1234f;
		a = (int) b; // here the float value is converted to int and the decimal
						// part
						// is truncated and the left part of float will be
						// assigned to int

		System.out.println(" Value of b is " + b);
		System.out.println(" Value of a is " + a);

		System.out
				.println("________________Example of internal Type casting_____________________");
		// Ex of internal type casting

		int x = 5;
		int y = 2;

		float z = x / y;
		System.out.println(x + "/" + y + " = " + z); // This prints 2.0 instead
														// of 2.5
		// Explaination

		// In any expressing the assignment happens at the last
		// fist the expression solved is x / y
		// x is 5 and its int and y is 2 and its int
		// so 5/2 is 2.5 but since x and y both are int sot compiler will
		// convert the result to int
		// so the result is now 2
		// then the assignment expression executes just like z = 2;
		// then the type convertion hapens and it becomes 2.0

		// Why Compiler make the result to int is because in the below
		// expression
		// the result assignmet that is like w could be int, so compiler convert
		// result to int
		int w = x / y;

		// int w = (float)/ y // we will get compilation error

		// so in the above exapmle to get the result in float make any operand
		// to float (Upper cast)
		z = (float) x / y;
		System.out.println(" THe type casted result x / y is " + z);

	}

}
