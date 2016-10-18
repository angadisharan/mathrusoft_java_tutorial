package strings;

public class Exception {
	public static void main(String[] args) {
		int x = 0;
		String stringTwo = "Hello";
		try {
			x = 5;
			int y = x / 2;
			System.out.println(stringTwo.charAt(-10));
			System.out.println("Result " + y);
		} catch (ArithmeticException exception) {
			System.out.println("Inside ArithmeticException : message ->  "
					+ exception.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Inside StringIndexOutOfBoundsException : message ->  "
							+ e.getMessage());
		} catch (java.lang.Exception e) {
			System.out.println("Inside Exception : message -> "
					+ e.getMessage());
			e.printStackTrace();
		} finally {
			x = 0;
		}

		System.out.println("X initial value " + x);

	}
}
