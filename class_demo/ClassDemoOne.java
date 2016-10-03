package class_demo;

public class ClassDemoOne {

	static class ClassA {
		int a;
		int b;
	}
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.a = 11;
		classA.b = 21;

		System.out.println(" classA.a " + classA.a);
		System.out.println(" classA.b " + classA.b);
		int b = classA.a + classA.b;

		System.out.println("B = " + b);
	}

}
