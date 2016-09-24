public class ScopeOfVariable {

	// Scope of a variable

	public static void main(String[] args) {
		{
			{
				int x = 1;// 1 <-- a variable X is created in memory
				System.out.println(" value of x first block in main " + x); // <--
			}// <-- all the local variables in the block will be vanished
		}

		{ // Second Block in Main
			int x = 5;
			System.out.println("Value of x in Second block " + x);

		}
		int x = 20;
		System.out.println("value of x in main scope " + x);

	}
}
