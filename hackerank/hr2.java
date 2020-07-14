package hackerank;

import java.util.Scanner;

public class hr2 {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 int a[][] = new int[n][n];
		 int x=0, y=0;
		 
		 for(int i=0; i<n; i++) 
		 {
			 for(int j=0; j<n; j++)
			 {
				 a[i][j] = sc.nextInt();
				 if(i == j)
					 x += a[i][i];
			 }
		 }
		 
		 
		 for(int i=0; i<n; i++)
		 {
			 for(int j=n-1-i; j>=0; j--)
			 {
					 y += a[i][j];
					 break;
			 }
		 }
		 System.out.println(x +" "+ y);
		 if(x>y)
			 System.out.println(x-y);
		 else
			 System.out.println(y-x);
	}

}
