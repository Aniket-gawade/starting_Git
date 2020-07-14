package hackerank;

import java.util.Scanner;

public class hr5 {
	
	public static void ans(int[] a , int n)
	{
		int x=0,y=0,p=a[0],l=a[0];
		for(int i=0; i<n-1; i++)
		{
			if(p < a[i+1]) {
				p = a[i+1];
				x++;
			}
			if(l > a[i+1]) {
				l = a[i+1];
				y++;
			}
		}
		
		System.out.println(y +" "+ x);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		ans(a , n);
	}

}
