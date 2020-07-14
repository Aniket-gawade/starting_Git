package programs;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter a no. to check : ");
		
		int n = sc.nextInt();
		
		int temp = n;
		int r = 0;
		int d = 0;
		while(temp != 0) {
		d = temp%10;
		temp /= 10;
		r = r*10+d;
		}
		if(n == r) {
			System.out.println(n + " is palindrom");
		} else 
		{
			System.out.println(n + " is not palindrom");
		}
	}

}
