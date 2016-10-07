package inheritance.main;

import inheritance.employee.Employee;
import inheritance.employee.HourlyEmployee;

public class MyMain {

	public static void main(String[] args) {
//		Employee employee = new Employee("Pooja", "MT001", 0.0f);
//		Employee employee = new Employee("Pooja");

		// employee.setName("Pooja");
		// employee.setEmployeeId("MT001");
		// employee.setEarning(0.0f);

//		employee.displayDetails();

//		System.out.println("Employee details " + employee);
		
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Kiran");
		hourlyEmployee.displayDetails();
		
	}

}
