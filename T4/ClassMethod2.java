package TestOne;

public class ClassMethod2 {
	private static float averageOfArray(int array[]) {
		System.out.println(" inside averageOfArray");

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		float average = (float) sum / array.length;
		return average;
	}
	
	public static void main(String[] args) {
		System.out.println(" inside Main");
		
		int[] array1 = { 1, 3, 0, 4, 12, 5, 6 };
		float average1 = averageOfArray(array1);

		int array2[] = new int[4];
		array2[0] = 2;
		array2[1] = 3;
		array2[2] = 5;
		array2[3] = 6;
		float average2 = averageOfArray(array2);

		System.out.println("AverageOne = " + average1);
		System.out.println("AverageTwo = " + average2);
	}



}
