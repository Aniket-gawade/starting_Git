package programs;

import java.util.*;

public class ReversString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string:");
		
		String s = sc.nextLine();
		
		reverse(s);
	}
	
	public static void reverse(String s)
	{
		int n = s.length();
		char[] a = s.toCharArray();
		
		if(n==0) return;
		
		swap(a , 0, n-1);
		
		for(char c:a) {
			System.out.print(c);
		}
	}
	
	static void swap(char[] a, int i, int e)
	{
		if(i==e)
				return;
		
		char t = a[i];
		a[i]=a[e];
		a[e]=t;
		
		if(i < e/2)
		{
			swap(a,i+1,e-1);
		}
		return;
	}
}
