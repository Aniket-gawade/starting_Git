package programs;

import java.util.Scanner;

public class PowerOfNumber {
	
	public static int multiply(int x, int result[] ,int resultsize) {
		int carry =0;
		
		for(int i=0 ; i<resultsize ; i++) {
			int prod = result[i]*x+carry;
			result[i] = prod%10;
			carry = prod/10;
		}
		
		while(carry>0) {
			result[resultsize++] = carry%10;
			carry/=10;
		}
		
		return resultsize;
	}
	
	public static void ans(int x , int n) {
		
		if(n==0) {
			System.out.print(x +"^"+ n +" = 1");
			return;
		}
		
		int result[] = new int [100000];
		int resultsize =0;
		int t=x;
		
		while(t!=0) {
			result[resultsize++] = t%10;
			t/=10;
		}
		
		for(int i=2 ; i<=n ; i++) {
			resultsize = multiply(x ,result , resultsize);
		}
		
		System.out.print(x +"^"+ n +" = ");
		for(int i=resultsize-1 ; i>=0 ;i--) {
			System.out.print(result[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter base numbe : ");
		int x = sc.nextInt();
		System.out.print("enter power : ");
		int n = sc.nextInt();
		
		ans(x,n);
	}

}
