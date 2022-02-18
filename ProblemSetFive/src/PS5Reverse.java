import java.util.Scanner;

public class PS5Reverse {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #5, Problem #2
		* Date: September 27, 2019
		* ********************************************************/

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = keyboard.nextLine();
		String word2 = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			
			word2 += word.charAt(i);
		}
		
		System.out.println("Reverse Order: " + word2);
		
		keyboard.close();

	}

}
