
public class UAStudent {
	
	/* ********************************************************
	* Student Name: Noah Buchanan
	* Class: CS 1024 Foundations of Programming II
	* Assignment: Problem Set 5, Problem 1
	* Date: March 3, 2020
	* ********************************************************/


	private String stuName;
	private String email;
	private int stuNum;

	public UAStudent() {

		this.stuName = null;
		this.email = null;
		this.stuNum = 0;
	}

	public UAStudent(String stuName, String email, int stuNum) {

		this.stuName = stuName;
		this.email = email;
		this.stuNum = stuNum;
	}

	public String getStuName() {

		return stuName;
	}

	public void setStuName(String stuName) {

		this.stuName = stuName;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public int getStuNum() {

		return stuNum;
	}

	public void setStuNum(int stuNum) {

		this.stuNum = stuNum;
	}

}
