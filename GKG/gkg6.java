package GKG;

import java.util.Scanner;

public class gkg6 {
	
	public static void main (String[] args)
	 {
   	 Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for(int i=0; i<t; i++) {
	        int a[] = new int[100];
	        int n = sc.nextInt();
	        
	        for(int j=0; j<n; j++) {
	            a[j] = sc.nextInt();
	        }
	
	        for(int j=0; j<n/2; j++) {
	            if(a[j] != a[n-1-j]) {
	                System.out.println("NOT PERFECT");
	                return;
	            }
	        }
	        System.out.println("PERFECT");
	    }
	 }
}
