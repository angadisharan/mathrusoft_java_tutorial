package custom_exception;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		return "Hey I am a message from Custome MyException";		
	}
	
}
