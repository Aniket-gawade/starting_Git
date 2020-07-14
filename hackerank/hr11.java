//service lane

package hackerank;

import java.util.Scanner;

public class hr11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		int w[] = new int[n];
		for(int i=0; i<n;i++)
		{
			w[i]=sc.nextInt();
		}
		int cases[][] = new int[t][2];
		for(int i=0; i<t; i++)
		{
			cases[i][0]=sc.nextInt();
			cases[i][1]=sc.nextInt();
		}
		int[] result = ans(n, t, w, cases);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
	
	static int[] ans(int n, int t, int[] w,int cases[][])
	{
		int result[] = new int[t];
		for(int i=0; i<t; i++)
		{
			int x= cases[i][0];
			int y= cases[i][1];
			int min=w[x];
			for(int j=x; j<y; j++)
			{
				if(w[j+1]<min)
					min=w[j+1];
			}
			result[i] = min;
		}
		return result;
	}
}
