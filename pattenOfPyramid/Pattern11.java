package pattenOfPyramid;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			
			int x=n;
			for(int j=1 ; j<=n-i ; j++) {
				
				System.out.print("  ");
			}
			
			for(int j=1 ; j<=i ; j++) {
				
				if(j==i) 
					System.out.print("0 ");
				else
					System.out.print(x-i+1 +" ");
				x++;
			}
			x=n;
			for(int j=2 ; j<=i ; j++) {
				
				System.out.print(x-1 +" ");
				x--;
			}
			System.out.println();
		}
	}
}
