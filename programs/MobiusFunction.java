package programs;

import java.util.Scanner;

public class MobiusFunction {
	
	public static int mobius(int n) {
		if(n==1)
			return 1;
		
		int y=0;
		for(int i=2 ; i<=n ; i++) {
			if(n%i==0) {
				y++;
				n/=i;
				if(n%i==0)
					return 0;
			}
		}

		if(y%2==0)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number : ");
		int n = sc.nextInt();

		System.out.println(mobius(n));
	}

}
