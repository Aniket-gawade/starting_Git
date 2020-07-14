package programs;

import java.util.Scanner;

public class AckermanFunction {
	
	public static int ackerman(int a, int b)
	{
		if(a==0) {
			return b+1;
		}
		if(b==0) {
			return ackerman(a-1,1);
		}
		return ackerman(a-1 , ackerman(a,b-1));
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1  ; j<=10 ; j++) {
				System.out.println("A("+ i +","+ j +") = "+ ackerman(i,j));
			}
		}
		
	}

}
