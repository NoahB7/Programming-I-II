import java.util.Scanner;

public class PS4Lowest {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #4, Problem 1
		* Date: September 21, 2019
		* ********************************************************/

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		String input = keyboard.nextLine();

		char lowest = input.charAt(1);

		for (int i = 0; i <= 4; i++) {

			if (input.charAt(i) < lowest) {

				lowest = input.charAt(i);

			} else {

			}

		}

		System.out.println(lowest);

		keyboard.close();
	}

}
