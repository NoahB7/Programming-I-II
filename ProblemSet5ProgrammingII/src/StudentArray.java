import java.io.BufferedReader;
import java.io.FileReader;

public class StudentArray {
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Problem Set 5, Problem 1
	* Date: March 3, 2020
	* ********************************************************/

	int size;
	private UAStudent[] students;

	public StudentArray() {

		students = new UAStudent[20];
		
		
	}
	
	public StudentArray(int size) {
		
		students = new UAStudent[size];
	}
	
	

	public UAStudent[] getStudents() {

		return students;
	}

	public void setStudents(UAStudent[] students) {

		this.students = students;
	}

	public int getSize() {

		return size;
	}

	public void setSize(int size) {

		this.size = size;
	}

	public boolean loadArray(String file) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = "";
			int count = 0;

			while ((line = br.readLine()) != null) {
				
				String[] b = line.split(",");
				
				int last = Integer.parseInt(b[2]);
				
				UAStudent x = new UAStudent();
				
				x.setStuName(b[0]);
				x.setEmail(b[1]);
				x.setStuNum(last);
				
				
				
				students[count] = x;
				
				
				count++;
			}
			
			br.close();
			return true;
			
		} catch (Exception e){
			
			
			
			return false;
			
		}
		

	}
	
	public int addStudent(UAStudent a) {
		
		int number = 0;
		boolean found = false;
		int bigger = students.length + (students.length/4);
		
		for(int i = 0; i < students.length; i++) {
			
			if(students[i] == null) {
				
				number = i;
				students[i] = a;
				found = true;
			}
			
		}
		
		if(!found) {
			
			UAStudent[] x = new UAStudent[bigger];
			for(int i = 0; i < students.length; i++) {
				
				x[i] = students[i];
				number = i + 1;
			}
			
			x[number] = a;
			
		}
		
		return number;
	}

}
