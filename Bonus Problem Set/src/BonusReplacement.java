
public class BonusReplacement {
	
	public static void main(String[] args) {
		
		
		String[] x = {"B", "A", "A" ,"A"};
		boolean found = false;
		
		for(int i = 0; i < x.length; i++) {
			
			if(i % 2 != 0 && x[i].equals("B")) {
				
				found = true;
				x[i] = "Z";
			}
			
		}
		
		if(found) {
			System.out.println("*** Result ***");
			for(int i = 0; i < x.length; i++) {
				
				System.out.print(x[i]);
			}
			
		} else {
			System.out.println("*** Result ***");
			for(int i = 0; i < x.length; i++) {
				
				System.out.print(x[i]);
			}
			System.out.println("\nNO EVEN B'S FOUND!");
		}
	}
}
