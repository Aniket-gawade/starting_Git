package hackerank;

import java.util.Scanner;

public class hr4 {

	public static void result(int[] a, int n)
	{
		for(int i=0; i<n; i++)
		{
			if(a[i]%5!=0 && a[i]>=38)
			{
				int t = a[i] / 5;
				int x = (t+1)*5;
				if(x-a[i] <3)
				{
					a[i] = x;
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		result(a , n);
	}

}
