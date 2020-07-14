package programs;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter a number : ");
		int n = sc.nextInt();
		
		int a[] = new int[10];

		int t=n;
		int index =0;
		while(t!=0) {
			a[index] = t%10;
			t/=10;
			index++;
		}
		
		if(n<=26) {
			int x = n+64;
			char y = (char)x;
			System.out.println(y);
		}
		
		for(int i=index-1 ; i>=0 ; i--) {
			int x =a[i]+64;
			char y = (char)x;
			System.out.print(y +" ");
		}
	}

}
