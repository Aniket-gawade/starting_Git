package strings;

import java.util.Scanner;

public class doublePointer {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String ans = "";
		int i=s.length()-1;
		while(i>=0)
		{
			if(i>=0 && s.charAt(i)==' ')
				i--;
			int j=i;
			if(i<0)
				break;
			while(i>=0 && s.charAt(i)!=' ')
				i--;
			if(ans == "")
				ans += s.substring(i+1, j+1);
			else
				ans += " " + s.substring(i+1, j+1);
		}
		System.out.println(ans);
	}

}
