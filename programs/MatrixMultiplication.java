package programs;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter order of matrix : ");
		int n=sc.nextInt();
		
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] ans = new int[n][n];

		System.out.println("enter matrix A");
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter matrix B");
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("multiplication of matrix A & B is");
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				ans[i][j] = 0;
				for(int k=0 ; k<n ; k++) {
					ans[i][j] += a[i][k] * b[k][j]; 
				}
				System.out.print(ans[i][j] +" ");
			}
			System.out.println();
		}
	}

}
