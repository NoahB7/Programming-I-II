import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PS8ValidNames {

	public static void main(String[] args) throws IOException {
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 8, Problem 3
		* Date: November 25, 2019
		* ********************************************************/

		String bob = "bob";

		System.out.println(isNameValid(bob));

		BufferedReader br = new BufferedReader(new FileReader("guestlist.txt"));

		String line = "";
		String[] fileData = null;

		while ((line = br.readLine()) != null) {

			fileData = line.split(",");
			
			for(int i = 0; i < fileData.length; i++) {
				
				System.out.println(isValidName(fileData[i]));
			}
		}

		br.close();

	}

	public static boolean isNameValid(String name) throws IOException {

		boolean found = false;

		BufferedReader br = new BufferedReader(new FileReader("validnames.txt"));

		String line = "";
		String[] fileData = null;

		while ((line = br.readLine()) != null) {

			fileData = line.split(",");

			for (int i = 0; i < fileData.length; i++) {

				if (fileData[i].equals(name)) {

				}
			}
		}

		br.close();
		return found;
	}

	public static String isValidName(String name) {

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {

				count++;
			}
		}

		if (count == name.length()) {

			System.out.println(name);
		}
		
		return null;
	}

}
