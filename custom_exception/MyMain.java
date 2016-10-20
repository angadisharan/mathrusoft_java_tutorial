package custom_exception;

public class MyMain {

	public static void main(String[] args) {
		try {
			functionMimicThrowException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void functionMimicThrowException() throws MyException {

		throw new MyException();
	}

}
