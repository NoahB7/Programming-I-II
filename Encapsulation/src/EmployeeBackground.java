
public class EmployeeBackground {
	
	private String fname;
	private String lname;
	private String age;
	private String dept;
	private String salary;
	
	
//fname
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
//lname
	public String getlName() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
//age
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
//dept
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
//salary
	public String getSalary() {
		return salary;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
//toString
	public String toString() {
		return this.fname + " " + lname + " " + age + " " + dept + " " + salary;
	}

}
