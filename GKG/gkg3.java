package GKG;

import java.util.Scanner;

public class gkg3 {

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0; i<t ; i++)
	    {
	        int n = sc.nextInt();
	        int a[] = new int[500];
	        
	        for(int j=0; j<n; j++) 
	        {
	            a[j] = sc.nextInt();
	        }
	        
	        for(int j=1; j<n; j++)
	        {
	            if(a[j-1] > a[j]) {
	               int x = a[j-1];
	               a[j-1] = a[j];
	               a[j] = x;
	            }
	        }
	        
	        for(int j=1; j<n-1; j++) 
	        {
	            if(a[j-1] > a[j]) {
	               int x = a[j-1];
	               a[j-1] = a[j];
	               a[j] = x;
	            }
	        }
	        System.out.println(a[n-2]);
	    }
	}
}
