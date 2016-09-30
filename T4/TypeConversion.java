package TestOne;

public class TypeConversion {

	public static void main(String[] args) {
		int a = 9;
		float b = a;
		a = (int) b;

		System.out.println(" a is " + a + " b is " + b);

		long l = 0;
		int bb = (int) l;

		l = bb;

		String s = "Test";

		int test = 456;

		s = "" + test;

	}

}
