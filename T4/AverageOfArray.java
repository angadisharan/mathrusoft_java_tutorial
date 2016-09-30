package TestOne;

public class AverageOfArray {

	public static void main(String[] args) {

		int array[] = { 2, 3, 6, 7, 10, 5 };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		float average = (float) sum / array.length;

		System.out.println(" Sum  = " + sum);
		System.out.println(" Average  = " + average);
	}

}
