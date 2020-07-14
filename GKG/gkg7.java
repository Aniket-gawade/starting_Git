package GKG;

import java.util.Scanner;

public class gkg7 {

	public static void main (String[] args)
	 {
   	 Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for(int i=0; i<t; i++) {
	        
	        long n = sc.nextInt();
           int a[] = new int[100];
           
           long x = n*2;
           long y = n*3;
           
           String s1 = Long.toString(n);
           String s2 = Long.toString(x);
           String s3 = Long.toString(y);
           
           String check = s1+s2+s3;
           System.out.println(check);
           
           
           if(s1.length() <3)
        	   System.out.println("Number should be atleast three digits");
           else {
        	   int l=0 , m=0;
        	   String str = "123456789";
        	   char k;
        	   for(m=0; m<str.length(); m++) {
        		   k = str.charAt(m);
        		   boolean visited = false;
		           for(l=0; l<check.length(); l++) {
		               if(check.charAt(l) == k)
		                   visited = true;
		           }
		           
		           System.out.println(k);
		           k++;
		           if(visited == false) {
		        	   break;
		           }
		           
        	   }
	           if(m==str.length())
	               System.out.println("Fascinating");
	           else
	               System.out.println("Not Fascinating");
           }
	    }
	 }
}
