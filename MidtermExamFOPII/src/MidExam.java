
public class MidExam {
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Midterm
	* Date: April 8, 2020
	* ********************************************************/

	public static void main(String[] args) {
		
		run();
	}

	public static void run() {

		UAEmployee u1 = new UAEmployee("Bob", "Smith ", 123, "CS");
		UASalaryEmployee u2 = new UASalaryEmployee("Bob","Smith",456,"MATH");
		UACommissionEmployee u3 = new UACommissionEmployee("Bob", "Smith", 123, "CS");
		u3.setCommissionRate((float) 1.25);
		u3.setGrossSales(55000);
		UAHourlyEmployee u4 = new UAHourlyEmployee();
		u4.setWage((float) 20.50);
		u4.setNumHoursWorked(20);
		UABaseWithCommissionEmployee u5 = new UABaseWithCommissionEmployee();
		u5.setFirstName("Bob");
		u5.setLastName("Smith");
		u5.setCommissionRate((float) 1.25);
		u5.setGrossSales(155000);
		u5.setDepartment("CS");
		u5.setBaseSalary(123000);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println(u5);
		System.out.println();
		
		//The difference between these lines is here you are creating new Employee's and replicating
		//the data from u2 to the new u6 and u3 to the new u7 and so on and thats why the data is the same
		//when it prints out again but with u6,u7,u8 and so on instead of starting with u1
		
		UAEmployee u6 = u2;
		UAEmployee u7 = u3;
		UAEmployee u8 = u4;
		UAEmployee u9 = u5;
		System.out.println(u6);
		System.out.println(u7);
		System.out.println(u8);
		System.out.println(u9);

	}

}
