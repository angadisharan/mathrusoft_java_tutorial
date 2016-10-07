package inheritance.employee;

public class Employee {
	 String name;
	private String employeeId;
	private float earning;

	// Constructor is a method in a class with the name same as Class Name,
	// and no return type
	public Employee() {

	}

	public Employee(String name, String employeeId, float earning) {
		this.name = name;
		this.employeeId = employeeId;
		this.earning = earning;
	}
	
	public Employee(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public float getEarning() {
		return earning;
	}

	public void setEarning(float earning) {
		this.earning = earning;
	}

	public void displayDetails() {
		System.out.println("Name : " + name + "\n" + "EmployeeID : "
				+ employeeId + "\n" + "Earning : " + earning + "\n");
	}

	 @Override
	 public String toString() {
	 return "Name : " + name + "\n"
	 + "EmployeeID : " + employeeId + "\n"
	 + "Earning : " + earning + "\n";
	 }

}
