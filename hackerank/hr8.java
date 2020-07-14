package hackerank;

import java.util.Scanner;

public class hr8 {
	
	public static String ans(int x1,int v1,int x2,int v2)
	{
		int a = x1+v1;
        int b = x2+v2;
        if(a>b)
        {
            if(a%b==0 && ((x1<x2 && v1>v2) || (x1>x2 && v1<v2)))
                return "YES";
        }
        if(b>a)
        {
            if(b%a==0 && ((x1<x2 && v1>v2) || (x1>x2 && v1<v2)))
                return "YES";
        }
        if(a==b) {
            if((x1<x2 && v1>v2) || (x1>x2 && v1<v2))
                return "YES";
        }
        return "NO";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		
		System.out.println(ans(x1,v1,x2,v2));
	}

}
