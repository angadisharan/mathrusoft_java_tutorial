package polymorphism;

public class ClassMain {

	public static void main(String[] args) {		
		AnimalCommands command;
		
//		Cat cat = new Cat();
//		command = cat;
		
//		Dog dog = new Dog();
//		command = dog;		
		
		Cow cow = new Cow();
		command = cow;
		
		command.speak();
		
		
	}

}
