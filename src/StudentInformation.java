import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* ********************************************************
* Student Name: Noah Buchanan
* Class: CS 1024 Foundations of Programming II
* Assignment: Final Exam
* Date: May 4, 2020
* ********************************************************/

public class StudentInformation extends MyAbstract{
	
	private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private int age;
    private String major;
    
    ArrayList<StudentInformation> myList;
    
    
    public ArrayList<StudentInformation> getInfo() throws IOException {
    	
    	this.myList = new ArrayList<>();
    	
    	BufferedReader br = new BufferedReader(new FileReader("StudentData"));
    	
    	String line = "";
    	
    	br.readLine();
    	
    	while((line = br.readLine()) != null) {
    		
    		String[] x = line.split(",");
    		
    		StudentInformation a = new StudentInformation();
    		a.setFirstName(x[0]);
    		a.setLastName(x[1]);
    		a.setAddress(x[2]);
    		a.setPhoneNumber(x[3]);
    		a.setAge(Integer.parseInt(x[4]));
    		a.setMajor(x[5]);
    		this.myList.add(a);
    		
    	}
    	
    	
    	return this.myList;
    }


    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}



	@Override
	public void displayAllFirstNames() throws IOException {
		
		for(int i = 0; i < myList.size(); i++) {
			
			System.out.println(myList.get(i).getFirstName());
		}
		
	}



	@Override
	public int displayAllStudentAgeAvg() throws IOException {
		
		int total = 0;
		
		for(int i = 0; i < myList.size(); i++) {
			
			total += myList.get(i).getAge();
			
		}
		
		return total/myList.size();
	}



	@Override
	public boolean findAStudentByName(String nameToSearch) throws IOException {
		
		boolean found = false;
		for(int i = 0; i < myList.size(); i++) {
			
			if(nameToSearch.equals(myList.get(i).getFirstName())) {
				
				found = true;
			} else if(i == myList.size()) {
				
				found = false;
			}
		}
		
		return found;
	}



	@Override
	public String[] displayAllStudentInformationOlderThan18() throws IOException {
		
		String[] x = new String[myList.size()];
		
		for(int i = 0; i < myList.size(); i++) {
			
			x[i] = myList.get(i).getFirstName() + ", " + myList.get(i).getLastName() + "," + myList.get(i).getAddress()
					+ "," + myList.get(i).getPhoneNumber() + "," + myList.get(i).getMajor();
			
			System.out.println(x[i]);
		}
		
		
		return x;
	}
    
    

}