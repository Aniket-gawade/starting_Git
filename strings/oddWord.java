package strings;

import java.util.Scanner;

public class oddWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String b = "";
		String c ="";
	
		for(int i=0; i<a.length(); i++) {
			if (i < a.length()/2)
				b = b +(a.charAt(i));
			else if(i>= a.length()/2)
				c = c + a.charAt(i);
		} 
		a = c + b;
	
		for (int i=1 ; i<=a.length() ; i++) {
			if (i<a.length()) {
			for(int j=1 ; j<=(a.length()*2)-2*i ; j++) {
				System.out.print(" ");
			}
			}
			
			System.out.println(a.substring(0,i));
		}
	}

}
