import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Employee {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("records"));
		String line = "";

		ArrayList<EmployeeBackground> list = new ArrayList<>();

		System.out.println(br.readLine());

		
		while((line = br.readLine()) != null) {
			
			EmployeeBackground a = new EmployeeBackground();
			
			String[] x = line.split(",");
			
			a.setFname(x[0]);
			a.setLname(x[1]);
			a.setAge(x[2]);
			a.setDept(x[3]);
			a.setSalary(x[4]);
			
			list.add(a);
			
			System.out.println(a.toString());

		}
		
		System.out.println(list.toString());

		br.close();
	}

}
