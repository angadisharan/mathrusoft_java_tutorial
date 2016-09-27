package TestOne;

public class LinearSorting {

	public static void main(String[] args) {
		int array[] = new int[5];

		array[0] = 4;
		array[1] = 1;
		array[2] = 6;
		array[3] = 10;
		array[4] = 12;
		array[5] = 0;
		array[6] = 5;
		array[7] = 7;
		array[8] = 3;
		array[9] = 2;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("sorted array  :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
