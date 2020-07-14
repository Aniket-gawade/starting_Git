package hackerank;

import java.util.Scanner;

public class hr3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int x=0,y=0;
		for(int i=0; i<3; i++)
		{
			a[i]= sc.nextInt();
		}
		
		for(int i=0; i<3; i++)
		{
			b[i]= sc.nextInt();
		}

		for(int i=0; i<3; i++)
		{
			if(a[i] > b[i])
				x++;
			if(b[i] > a[i])
				y++;
		}
		System.out.println(x +" "+ y);
	}

}
