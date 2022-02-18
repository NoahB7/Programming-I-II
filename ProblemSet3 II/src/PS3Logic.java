import java.util.Scanner;

/* ********************************************************
* Student Name: Noah Buchanan
* Class: CS 1024 Foundations of Programming II
* Assignment: Problem Set 3, Problem 1
* Date: February 7, 2020
* ********************************************************/

public class PS3Logic {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String t = scan.nextLine();

		String x = t.toLowerCase();
		String line = "";
		String equals = "";
		int count = 0;
		boolean valid = true;

		for (int i = 0; i < x.length(); i++) {

			if (x.charAt(i) <= '9' && x.charAt(i) >= '1') {
				System.out.println("Invalid");
				valid = false;
				break;
			} else {

				if (x.charAt(i) == 'a') {
					if (count % 3 == 0) {
						line += x.charAt(i) + " + ";
						equals += x.charAt(i);
						count++;
					} else {
						count++;
					}
				} else if (x.charAt(i) == 'e') {
					if (count % 3 == 0) {
						line += x.charAt(i) + " + ";
						equals += x.charAt(i);
						count++;
					} else {
						count++;
					}
				} else if (x.charAt(i) == 'i') {
					if (count % 3 == 0) {
						line += x.charAt(i) + " + ";
						equals += x.charAt(i);
						count++;
					} else {
						count++;
					}
				} else if (x.charAt(i) == 'o') {
					if (count % 3 == 0) {
						line += x.charAt(i) + " + ";
						equals += x.charAt(i);
						count++;
					} else {
						count++;
					}
				} else if (x.charAt(i) == 'u') {
					if (count % 3 == 0) {
						line += x.charAt(i) + " + ";
						equals += x.charAt(i);
						count++;
					} else {
						count++;
					}
				} 
			}

		}
	
		if (line.equals("")) {
			System.out.println("No Qualifying Vowels");
		} else if(valid) {
			String answer = line.substring(0, line.length() - 3);
			answer += " = ";
			System.out.println(answer += equals);
		}

		
		scan.close();
	}

}
