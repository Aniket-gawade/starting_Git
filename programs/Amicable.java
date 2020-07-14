package programs;

import java.util.Scanner;

public class Amicable {
	
	public static void check(int a, int b) {
		int x=0 , y=0;
		
		for(int i=1 ; i<a ; i++) {
			if(a%i == 0)
				x += i;
		}
		
		for(int i=1 ; i<b ; i++) {
			if(b%i == 0)
				y += i;
		}
		
		if(a==y && b==x)
			System.out.println(x +" "+ y +" True");
		else
			System.out.println(x +" "+ y +" False");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 2 numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		check(a , b);
	}

}
