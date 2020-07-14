package GKG;

import java.util.*;
import java.lang.*;
import java.io.*;

public class gkg1 {
	
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			int x[] = new int[100];
			for(int i=0; i<t ; i++) {
			    int n = sc.nextInt();
			    int a[] = new int[n];
			    int y=0;
			    for(int j=0 ; j<n ; j++) {
			        a[i] = sc.nextInt();
			        y+=a[i];
			    }
			    x[i] = y;
			}
			for(int i=0 ; i<t ; i++) {
			 System.out.println(x[i]);   
			}
		}
	
}
