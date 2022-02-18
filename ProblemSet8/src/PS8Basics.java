
public class PS8Basics {
	
	public static void main(String[] args) {
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 8, Problem 1
		* Date: November 24, 2019
		* ********************************************************/
		
		
		System.out.println(calcDistance(2,2,4,4));
		
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		
		double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		return d;
	}

}
