package programs;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter a length : ");
		
		int n = sc.nextInt();
		
		int num[] = new int[n];
		
		System.out.println("enter numbers now ");
		
		for(int i=0 ; i<n ; i++) {
			
			num[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n-1 ; i++) {
			
			for(int j=0 ; j<n-1-i ; j++) {
				
				if (num[j+1] < num[j]) {
					
					int t = num[j];
					num[j] = num[j+1];
					num[j+1] = t;
				}
			}
		}
		
		System.out.println("numbers in increasing ortder are");
		
		for(int x: num) {
			
			System.out.println(x+ " ");
		}
	}
}
