import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PS7Gradebook {

	public static void main(String[] args) throws IOException {
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 7, Problem 2
		* Date: November, 4, 2019
		* ********************************************************/

		BufferedWriter bw = new BufferedWriter(new FileWriter("grade-book.txt"));

		String name = "";
		String ID = "";
		String grade = "";
		String holder = "";
		boolean invalid = false;
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student's name (minimum of two characters): ");
		name = scan.nextLine();
		if (name.length() < 2) {
			count++;
		}

		System.out.println("Enter the student's university ID ( @123456789 ): ");
		ID = scan.nextLine();
		if (ID.charAt(0) != '@') {
			count++;
		}

		while (!holder.equals("END")) {

			invalid = false;
			System.out.println("Enter a score (or type END to terminate): ");
			holder = scan.nextLine();
			for (int i = 0; i < holder.length(); i++) {
				if (holder.charAt(i) >= 'a' && holder.charAt(i) <= 'z') {
					invalid = true;
				}
			}
			if (invalid) {
				System.out.println("INVALID");
			} else {
				grade += holder + ",";
			}
		}

		if (!grade.equals("")) {
			count++;
		}
		String finalGrades = grade.substring(0, grade.length()-5);

		if (count > 1) {

			System.out.println("INVALID INPUT");
		} else {

			bw.write(name + "," + ID + "," + finalGrades);
		}

		scan.close();
		bw.close();
	}

}