package GKG;

import java.util.Scanner;

public class gkg9 {
	
	public static void rotat(int a[] , int n) {
		int i,t = a[0];
		for(i=0; i<n-1; i++)
			a[i] = a[i+1];
		a[i] = t;
	}

	public static void main(String[] args) {

		   	 Scanner sc = new Scanner(System.in);
			    int t = sc.nextInt();
			    
			    for(int i=0; i<t; i++) {
			        int a[] = new int[100];
			        int n = sc.nextInt();
			        int d = sc.nextInt();
			        
			        for(int j=0; j<n; j++) {
			            a[j] = sc.nextInt();
			        }
			       
			        for(int j=0; j<d; j++) {
			        	rotat(a , n);
			        }
			        
			        for(int j=0; j<n; j++) {
			            System.out.print(a[j] +" ");
			        }

			    }
	}

}
