package polymorphism.interest;

public class SBI implements Interest {

	@Override
	public float getInterest() {
		return 15f;
	}

	@Override
	public float getInterest(int month) {
		return 12.2f;
	}

}
