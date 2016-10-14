package polymorphism.interest;

public class HDFC implements Interest {

	@Override
	public float getInterest() {
		return 15.0f;
	}

	@Override
	public float getInterest(int month) {
		switch (month) {
		case 1:
			return 12.0f;
		case 2:
			return 13.0f;
		case 3:
			return 14.0f;
		case 4:
			return 15.0f;
		case 5:
			return 11.0f;
		case 6:
			return 12.0f;
		case 7:
			return 13.0f;
		case 8:
			return 14.0f;
		case 9:
			return 15.0f;
		case 10:
			return 11.0f;
		case 11:
			return 12.0f;
		case 12:
			return 13.0f;
		default:
			return 15.0f;
		}

	}

}
