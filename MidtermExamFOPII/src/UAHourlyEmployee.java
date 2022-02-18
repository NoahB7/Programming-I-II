
public class UAHourlyEmployee extends UAEmployee{
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Midterm
	* Date: April 8, 2020
	* ********************************************************/

	private float wage;
	private int numHoursWorked;
	
	public float getWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}
	public int getNumHoursWorked() {
		return numHoursWorked;
	}
	public void setNumHoursWorked(int numHoursWorked) {
		this.numHoursWorked = numHoursWorked;
	}
	
	public double calcWage() {
		
		return wage*numHoursWorked;
	}
	
	public String toString() {
		
		return getFirstName() + "," + getLastName() + "," + getEmployeeID() + 
				"," + getDepartment() + "," + calcWage();
	}
	
	public UAHourlyEmployee() {
		super("","",0,"");
	}
	public UAHourlyEmployee(String firstName, String lastName, int employeeID,String department) {
		super(firstName, lastName,employeeID,department);
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		setDepartment(department);
	}
}
