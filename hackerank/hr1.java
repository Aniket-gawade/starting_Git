package hackerank;

import java.util.Scanner;

public class hr1 {

	  public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        long a[] = new long[5];
	        long sum=0,max=0,min=1000000000;
	        for(int i=0; i<5; i++)
	        {
	            a[i] = sc.nextLong();
	            if(a[i] > max)
	                max = a[i];
	            if(a[i] < min)
	                min = a[i];
	            sum += a[i];
	        }

	        System.out.println((sum-max) +" "+ (sum-min));
	    }
}
