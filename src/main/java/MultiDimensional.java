import java.util.Iterator;

public class MultiDimensional {

	public static void main(String[] args) {
		
		int col = 0;
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		int min = a[0][0];
		
		for (int i = 0; i <3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				
				if (a[i][j]<min) {
					
					min = a[i][j];
					col= j;
//				j=	1
				}
				
				
			}
			
			
			
		}
		
	int	max = a[0][1];
		
	for (int k = 0; k <3; k++) {
		
		
		
		if (a[k][col]>max) {
			
			
		max = a[k][col];
			
		}
		
		
	}
			
			System.out.println(max);
			
			
		}
		
		

	}


