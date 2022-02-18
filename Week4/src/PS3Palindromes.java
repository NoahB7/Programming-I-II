import java.util.Scanner;

public class PS3Palindromes {
	
	public static void main(String[] args) {
		
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a 5 character number: ");
		String pal = keyboard.nextLine();
		int pallength = pal.length();
		
		if(pallength == 5) {
			
			String p1 = pal;
			String p2 = "";
			
			
			for(int i = 4; i >= 0; i--) {
				
				
				p2 = p2 + pal.charAt(i);
			}
			
			
			
			System.out.println(p1);
			System.out.println(p2);
			
			if(p1.equals(p2)) {
				
				System.out.println("Palindrome: True");
			
			} else {
				
				System.out.println("Palindrome: False");
			
			}
			
			
			
		} else {
			
			System.out.println("ERROR");
		
		}		
		
		keyboard.close();
	
	}

}


