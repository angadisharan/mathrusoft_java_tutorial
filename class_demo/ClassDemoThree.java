package class_demo;

public class ClassDemoThree {

	static class MathOperations {
		int a, b;
		int[] array;

		public int add() {
			return a + b;
		}

		public int subtract() {
			return a - b;
		}

		public int multiplication() {
			return a * b;
		}

		public float division() {
			return (float) a / b;
		}

	}

	public static void main(String[] args) {

		MathOperations mathOperationsOne = new MathOperations();
		mathOperationsOne.a = 9;
		mathOperationsOne.b = 3;
		
		int sum = mathOperationsOne.add();
		int substractionResult = mathOperationsOne.subtract();
		int multiplicationResult = mathOperationsOne.multiplication();
		float divisionResult = mathOperationsOne.division();
		System.out.println(mathOperationsOne.a + " + " + mathOperationsOne.b
				+ " = " + sum);
		System.out.println(mathOperationsOne.a + " - " + mathOperationsOne.b
				+ " = " + substractionResult);
		System.out.println(mathOperationsOne.a + " * " + mathOperationsOne.b
				+ " = " + multiplicationResult);
		System.out.println(mathOperationsOne.a + " / " + mathOperationsOne.b
				+ " = " + divisionResult);

		MathOperations mathOperationsTwo = new MathOperations();
		mathOperationsTwo.a = 12;
		mathOperationsTwo.b = 3;

		sum = mathOperationsOne.add();
		substractionResult = mathOperationsOne.subtract();
		multiplicationResult = mathOperationsOne.multiplication();
		divisionResult = mathOperationsOne.division();

		System.out.println(mathOperationsTwo.a + " + " + mathOperationsTwo.b
				+ " = " + sum);
		System.out.println(mathOperationsTwo.a + " - " + mathOperationsTwo.b
				+ " = " + substractionResult);
		System.out.println(mathOperationsTwo.a + " * " + mathOperationsTwo.b
				+ " = " + multiplicationResult);
		System.out.println(mathOperationsTwo.a + " / " + mathOperationsTwo.b
				+ " = " + divisionResult);
	}
}
