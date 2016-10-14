package method_overloading;

public class ClassB extends ClassA {
	
	public	ClassB(){
		
	}

	String string;
	public	ClassB(String message){
		string = message;
	}

	
	@Override
	public void printMessage() {
		System.out.println("Message from Class B");
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	public void printMessage(String message, String messageTwo){
		System.out.println(message + " " + messageTwo);
	}
	
	public void printMessage(ClassA a) {
		a.printMessage();
	}
	
}
