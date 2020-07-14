package GKG;

import java.util.Scanner;

public class gkg2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			System.out.println(palinArray(a , n));
		}
	}
	
	public static int palinArray (int[]a , int n) {
		 int i;
         for(i=0; i<n; i++) {
             int x = a[i];
             int c=0  , b=0;
             while(x>0) {
                 c = x%10;
                 b = b*10 + c;
                 x/=10;
             }
             x = a[i];
             if(b!=x) {
                return 0;
             }
         }
         if(i==n)
            return 1;
         return 0;
   }
}