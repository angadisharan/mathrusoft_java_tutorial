package method_overloading;

public class ClassMain {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		
		b.printMessage();
		b.printMessage("Hello");
		b.printMessage("Welcome ", "Mathrusoft");
		
		ClassA a = new ClassA();
		a.printMessage();
		b.printMessage(a);
		
	}

}
