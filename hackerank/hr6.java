package hackerank;

import java.util.Scanner;

public class hr6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d[] = new int[m];
		int e[] = new int[n];
		int x=0,y=0;
		
		for(int i=0; i<m; i++)
		{
			d[i]= sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			e[i]= sc.nextInt();
		}
		
		for(int i=0; i<m; i++)
		{
			d[i] = d[i] + a;
			if(d[i]<=t && d[i]>=s)
				x++;
		}
		
		for(int i=0; i<n; i++)
		{
			e[i] = e[i] + b;
			if(e[i]<=t && e[i]>=s)
				y++;
		}
		System.out.println(x +"\n"+ y);
	}

}
