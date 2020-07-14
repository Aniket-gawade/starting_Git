package programs;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter a length : ");
		
		int n = sc.nextInt();
		
		int num[] = new int[n];
		
		System.out.println("enter numbers now ");
		
		for(int i=0 ; i<n ; i++) {
			
			num[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n ; i++) {
			
			int index =i;
			for(int j=i ; j<n ; j++) {
				
				if(num[j] < num[i]) {
					
					int t = num[i] ;
					num[i] = num[j];
					num[j] = t;
				}
			}
		}

		System.out.println("numbers in increasing ortder are");
		
		for(int x: num) {
			
			System.out.println(x+ " ");
	}
	
	}

}
