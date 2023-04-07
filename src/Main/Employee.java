package Main;

public class Employee {
	
	private long employeeID;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	
	public Employee(long employeeID, String name, String address, long phone, double salary) {
		this.employeeID = employeeID;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
		
	}
	
	public void calculateSalary() {
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println(employeeName + " salary = " + salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 10 * basicSalary / 100.;
		System.out.println(employeeName + " transport allowance = " + transportAllowance);
	}
	
	public void info() {
		System.out.println("");
	}
	

}
