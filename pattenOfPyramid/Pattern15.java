package pattenOfPyramid;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.print("enter number : ");
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			
			for(int j=1 ; j<=i-1 ; j++) {
				System.out.print(" ");
			}
			
			int x=i;
			int y=n;
			for(int j=1 ; j<=n-i+1 ; j++) {
				System.out.print(x +" ");
				x+=y;
				y--;
			}			
			System.out.println();
		}

	}

}
