import java.util.Scanner;

public class PS4Parse {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #4, Problem 4
		* Date: September 21, 2019
		* ********************************************************/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = scan.nextLine();

		int pos1 = word.indexOf('+');
		int pos2 = word.indexOf('-');

		String newWord = word.substring(pos1 + 1, pos2);
		String finalWord = "";

		int count = newWord.length() - 2;

		while (count >= 0) {

			finalWord += newWord.charAt(count);
			count = count - 2;

		}

		System.out.println("Resulting String: " + finalWord);

		scan.close();
	}

}
