package programs;

import java.util.*;

public class PalindromRucursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(isPal(s));
	}
	
	public static boolean isPal(String s) {
		int n = s.length();
		if(n==0) return true;
		
		return recpal(s,0,n-1);
	}
	
	public static boolean recpal(String s, int i, int e)
	{
		if(i==e)return true;
		
		if(s.charAt(i) != s.charAt(e)) return false;
		
		if(i<e+1)
			return recpal(s,i+1,e-1);
		
		
		return true;
		
	}

}
