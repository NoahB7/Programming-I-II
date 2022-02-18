
public class BonusLogic {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5};
		int product = 1;
		
		for(int i = 0; i < x.length; i++) {
			
			product = 1;
			for(int j = 0; j < x.length; j++) {
				
				if(j == i) {
					
					
				} else {
					
					product *= x[j];
				}
				
				
				
			}
			
			System.out.print(product + " ");
		}
		
		
		
	}

}
