package class_demo2;

public class IntArray {

	int[] array;

	public void sort() {
		if (array == null) {
			System.out.println("Array is empty, please initialise");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

	public void printArray() {
		if (array == null) {
			System.out.println("Array is empty, please initialise");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
