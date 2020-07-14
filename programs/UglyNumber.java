package programs;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter no. to check : ");
		int n = sc.nextInt();
		
		if(n==1)
			System.out.println("ugly number");
		else {
			int a=0;
			
			while(n != 1) {
				if(n%5==0)
					n/=5;
				else if(n%3==0)
					n/=3;
				else if(n%2==0)
					n/=2;
				else {
					System.out.println("not ugly number");
					a++;
					break;
				}
			}
			
			if(a==0)
				System.out.println("ugly number");
		}
	}

}
