package pattenOfPyramid;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x=1;
		for(int i=1 ; i<=n ; i++) {
			
			for(int j=1 ; j<=n-i ; j++) {
				
				System.out.print("  ");
			}
			
		for(int j=1 ; j<=2*i-1 ; j++) {
			
			if(j==1 || j==2*i-1) {
				System.out.print(x +" ");
				}
			else {
				System.out.print("0 ");
			}
		}
		x++;
		System.out.println();
		}

	}

}
