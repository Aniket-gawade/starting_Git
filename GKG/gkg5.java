package GKG;

import java.util.Scanner;

public class gkg5 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int t = sc.nextInt();
	    
	    
	    for(int i=0; i<t; i++) {
	        int a[] = new int[100];
	        int n = sc.nextInt();
	        int count=0;
	        
	        for(int j=0; j<n; j++) {
	            a[j] = sc.nextInt();
	        }
	        
	        int c = sc.nextInt();
	       
	        for(int j=0; j<n; j++) {
	            if(a[j] <= c) {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }

	}

}
