import java.util.Scanner;

public class PS6Square {
	
	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 6, Problem 2
		* Date: October 4, 2019
		* ********************************************************/
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many values would you like to enter? ");
		int userInput = keyboard.nextInt();
		
		int[] a = new int[userInput];
		
		int truecounter = 1;
		
		for(int i = 0; i < userInput; i++) {
			
			System.out.print("Enter a value: ");
			a[i] = keyboard.nextInt();
			
		}
		
		for(int i = 0; i < userInput-1; i++) {
			
			if((a[i] * a[i]) == a[i+1]) {
				
				truecounter++;
			}
		}
		
		System.out.println();
		
		if(truecounter == userInput) {
			System.out.println("The result is: TRUE");
		} else {
			System.out.println("The result is: FALSE");
		}
		
		keyboard.close();
		
	}

}
