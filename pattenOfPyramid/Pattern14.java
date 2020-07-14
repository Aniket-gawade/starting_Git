package pattenOfPyramid;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[][] x = new int[n][n];
		
		for(int i=0 ; i<n ; i++) {
			
			for(int j=0 ; j<n-i-1 ; j++) {
				
				System.out.print("  ");
			}
			
			for(int j=0 ; j<=i ; j++) {
				
				if(j==0 || j==i)
					x[i][j] = 1;
				else
					x[i][j] = x[i-1][j]+x[i-1][j-1];
				
				System.out.print(x[i][j] +"   ");
			}
			
			System.out.println();
		}
	}

}
