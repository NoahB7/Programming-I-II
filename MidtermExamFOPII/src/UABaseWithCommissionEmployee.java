
public class UABaseWithCommissionEmployee extends UACommissionEmployee{
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Midterm
	* Date: April 8, 2020
	* ********************************************************/

	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	UACommissionEmployee b = new UACommissionEmployee();
	public double calcWage() {
		
		return baseSalary + (b.getGrossSales()*b.getCommissionRate());
	}
	

	public String toString() {
		
		return getFirstName() + "," + getLastName() + "," + getEmployeeID() + 
				"," + getDepartment() + "," + calcWage();
	}
	public UABaseWithCommissionEmployee() {
		super("","",0,"");
	}
	public UABaseWithCommissionEmployee(String firstName, String lastName, int employeeID,String department) {
		super(firstName, lastName,employeeID,department);
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		setDepartment(department);
	}
}
