package hackerank;

import java.util.Scanner;

public class hr7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int b = sc.nextInt();
		
		if((sum-a[k])/2==b)
			System.out.println("Bon Appetit");
		else
			System.out.println(b-(sum-a[k])/2);
	}

}
