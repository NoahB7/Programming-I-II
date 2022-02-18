
public class TwoDimArrayDiagonals {
	
	public static void main(String[] args) {
		
		int[][] array = {{1,2,3},
						 {4,5,6},
						 {7,8,9}};
		
		int[][] diagonals = diagonals(array);
		
		for(int i = 0; i < diagonals.length; i++) {
			
			for(int j = 0; j < diagonals.length; j++) {
				
				System.out.print(diagonals[i][j] + " ");
			}
			System.out.println();
		}
		
		}
		
	
	public static int[][] diagonals(int[][] x){
		
		int countRow = 2;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x[0].length; j++) {
				
				if(i == j) {
					
					
				} else if(j == countRow) {
					
					
				} else {
					
					x[i][j] = 0;
				}
			}
			countRow--;
		}
		
		return x;
	}

}
