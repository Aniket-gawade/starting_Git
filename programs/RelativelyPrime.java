package programs;

import java.util.Scanner;

public class RelativelyPrime {
	
	public static void check(int a, int b) {
		int i;
		for(i=a ; i>1; i--) {
			if(a%i==0 && b%i==0) {
				System.out.println("not co-prime");
				break;
			}
		}
		if(i==1)
			System.out.println("co-prime numbers");

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		check(a , b);
	}

}
