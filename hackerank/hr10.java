package hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hr10 {

    // Complete the marsExploration function below.
    static int result(String s) {
        int ans=0;
        String t="";
        for(int i=0; i<s.length();i+=3)
        {
            t += s.substring(i,i+3) +" ";
        }
        String t1[] = t.split("\\s",s.length()/3);
        for(int i=0; i<t1.length; i++)
        {
        	System.out.println(t1[i]);
            if(t1[i].trim() != "SOS") {
                ans++;
            }
        }
         return ans;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        
    	System.out.println("enter string ");
    	String s = sc.nextLine();
    	System.out.println(result(s));
    }
}
