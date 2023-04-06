package Main;

public class Manager extends Employee {
		
	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone, salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary /100.;
		System.out.println("Manager transport allowance = " + transportAllowance);
	}

}
