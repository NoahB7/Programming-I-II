import java.util.Scanner;

public class PS4Mix {
	
	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #4, Problem 2
		* Date: September 21, 2019
		* ********************************************************/
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = keyboard.nextLine();
		
		int inputLength = input.length();
		int count = 0;
		int sum = 0;
		
		
		for(int i = 0; i < inputLength; i++) {
			
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				
				sum += input.charAt(i);
				count++;
			}
			
			
		}
		
		System.out.print("Average of numbers in the string: ");
		System.out.println((char)(sum/count));
		
		keyboard.close();
	}

}
