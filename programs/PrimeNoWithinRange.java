package programs;

import java.util.Scanner;

public class PrimeNoWithinRange {

	public static void check(int l ,int u) {
		for(int i=l ; i<=u ; i++) {
			int j;
			for(j=2 ; j<i ; j++) {
			if(i%j == 0) 
				break;
			}
			if(j == i)
				System.out.print(i +"* ");
			else
				System.out.print(i +" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter lower limit : ");
		int l = sc.nextInt();
		System.out.print("enter upper limit : ");
		int u = sc.nextInt();
		
		check(l , u);
	}

}
