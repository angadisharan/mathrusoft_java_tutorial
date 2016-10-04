package class_demo2;

public class ClassSort {

	public static void main(String[] args) {
		IntArray intArray = new IntArray();

		intArray.array = new int[] { 23, 5, 66, 7, 0, 1, 10 };

		System.out.println("Before sorting");
		intArray.printArray();
		intArray.sort();
		
		System.out.println("After sorting");
		intArray.printArray();

	}

}
