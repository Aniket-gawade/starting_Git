package programs;

import java.util.Scanner;

public class Fibonacci {
	
	static void printNO(int n) {
		int a=0;
		int b=1;
		int c=0;
		
		if (n==1)
			System.out.print("Nth term is : "+ a);
		else if(n==2)
			System.out.print("Nth term is : "+ b);
		else {
			for(int i=3 ; i<=n ; i++) {
				c = a+b;
				a=b;
				b=c;
			}
		System.out.print("Nth term is : "+ b);
	}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter Nth term : ");
		int n = sc.nextInt();
		
		printNO(n);
	}

}
