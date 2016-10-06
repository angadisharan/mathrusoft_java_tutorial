package pattern;

public class PatternRhombus {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.print("\n"); // System.out.println();
		}

//		n = n - 1;

		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + "*" + " ");
			}
			// System.out.print("\n");
			System.out.println();
		}
	}

}
