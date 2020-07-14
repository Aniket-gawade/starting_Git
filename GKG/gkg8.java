package GKG;
import java.util.Scanner;

public class gkg8 {
	
	public static void main (String[] args)
	 {
   	 Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    for(int i=0; i<t; i++) {
	    	String a[] = new String[10];
	        int n = sc.nextInt();
	        
	        for(int j=0; j<n; j++) {
	            a[j] = sc.next();
	        }
	        
	        String max= "";
	        
	        for(int j=0; j<n; j++) {
	        	if(a[j].length() > max.length()) {
	        		max = a[j];
	        	}
	        }
	        
	        System.out.println(max);
	    }
	 }

}
