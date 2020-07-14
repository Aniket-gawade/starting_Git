package programs;

import java.util.Scanner;

public class Recursion1 {
	
	public static void print(int n) {
		if(n<0 || n==0) {
			System.out.print(n + " ");
			return ;
		}
			System.out.print(n + " ");
			print(n-5);
			
			System.out.print(n + " ");
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number : ");
		int n = sc.nextInt();
		
		print(n);

	}

}
