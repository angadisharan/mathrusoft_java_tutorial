package polymorphism.interest;

public class Main {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
		
		System.out.println("SBI default interest " + sbi.getInterest());
		System.out.println("HDFC default interest " + hdfc.getInterest());
		
		System.out.println("SBI month interest " + sbi.getInterest(2));
		System.out.println("HDFC month interest " + hdfc.getInterest(2));
		
	}

}
