import java.util.Scanner;

public class PS6Reverse {
	
	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 6, Problem 3
		* Date: October 4, 2019
		* ********************************************************/
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String userInput = keyboard.nextLine();
		
		String firstHalf = userInput.substring(0, userInput.length()/2);
		String secondHalf = userInput.substring(userInput.length()/2, userInput.length());
		String newSecondHalf = "";
		
		
		for(int i = secondHalf.length()-1; i >= 0; i--) {
			
			newSecondHalf += secondHalf.charAt(i);
		}
		System.out.println("Reverse order: " + firstHalf + newSecondHalf);
		
		keyboard.close();
	}

}
