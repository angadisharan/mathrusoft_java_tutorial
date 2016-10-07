package inheritance.employee;

public class HourlyEmployee extends Employee {

	private String name;

	private int hours;
	private float hoursPay;

	public HourlyEmployee(String name, String id, float earnings, int hours,
			float hoursPay) {
		setName(name);
		setEmployeeId(id);
		// setEarning(earning);

	}

	public HourlyEmployee(String name) {
		this.name = name;
//		setName(name);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getHoursPay() {
		return hoursPay;
	}

	public void setHoursPay(float hoursPay) {
		this.hoursPay = hoursPay;
	}

	public void displayDetails() {
		System.out.println(" Pint Name " + super.name);

	}

}
