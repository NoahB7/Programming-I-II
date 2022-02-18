import java.io.IOException;

public class UASalaryEmployee extends UAEmployee{
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Midterm
	* Date: April 8, 2020
	* ********************************************************/
	
	
	private double monthlySalary;

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double calcWage() {
		
		return monthlySalary;
	}

	public String toString() {
		
		return getFirstName() + "," + getLastName() + "," + getEmployeeID() + 
				"," + getDepartment() + "," + calcWage();
	}
	
	public UASalaryEmployee() {
		super("","",0,"");
	}
	public UASalaryEmployee(String firstName, String lastName, int employeeID,String department) {
		super(firstName, lastName,employeeID,department);
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		setDepartment(department);
	}
	public UASalaryEmployee(String x)throws IOException {
		super("","",0,"");
		
		String[] y = x.split(",");
		
		if(!(y.length>5)) {
			setFirstName(y[0]);
			setLastName(y[1]);
			setEmployeeID(Integer.parseInt(y[2]));
			setDepartment(y[3]);
			setMonthlySalary(Double.parseDouble(y[4]));
		} else {
			System.out.println("Error");
		}
	
		
	}
	

}
