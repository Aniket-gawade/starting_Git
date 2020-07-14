package GKG;

import java.util.Scanner;

public class gkg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for(int i=0; i<t; i++) {
	        int a[] = new int[100];
	        int n = sc.nextInt();
	        
	        for(int j=0; j<n; j++) {
	            a[j] = sc.nextInt();
	        }
	        
	        for(int j=1; j<n; j++) {
	            if(a[j-1] > a[j]) {
	                int x;
	                x = a[j];
	                a[j] = a[j-1];
	                a[j-1] = x;
	            }
	        }
	            
	        for(int k=1; k<n-1; k++) {
	            if(a[k-1] < a[k]) {
	                int y;
	                y = a[k];
	                a[k] = a[k-1];
	                a[k-1] = y;
	            }
	        }
	        System.out.println(a[n-1] +" "+ a[n-2]);
	 }

	}

}
