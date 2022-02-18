
public class UACommissionEmployee extends UAEmployee {
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Midterm
	* Date: April 8, 2020
	* ********************************************************/
	
	private float commissionRate;
	private float grossSales;
	
	public float getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}
	public float getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(float grossSales) {
		this.grossSales = grossSales;
	}
	
	public double calcWage() {
		
		return grossSales*commissionRate;
	}
	
	public String toString() {
		
		return getFirstName() + "," + getLastName() + "," + getEmployeeID() + 
				"," + getDepartment() + "," + calcWage();
	}
	
	public UACommissionEmployee() {
		super("","",0,"");
	}
	public UACommissionEmployee(String firstName, String lastName, int employeeID,String department) {
		super(firstName, lastName,employeeID,department);
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		setDepartment(department);
	}
	

}
