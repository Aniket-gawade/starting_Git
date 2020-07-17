package programs;

import java.util.*;

public class Power {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enetr base number and power:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(pow(a,b));
	}
	
	public static int pow(int a, int b)
	{
		if(b==0) return 1;
		if(b%2==0){
			return pow(a*a,b/2);
		}
		else{
			return(a*pow(a,b-1));
		}
	}
}
