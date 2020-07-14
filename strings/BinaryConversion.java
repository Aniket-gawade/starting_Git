package strings;

import java.util.Scanner;

public class BinaryConversion {
	
	public static void isPalindrom(int n) {
		int x = n;
		String s1 ="";
		while(n>0) {
			int a =n%2;
			n/=2;
			s1 = a + s1;	
		}
		if(s1.length()<8)
			s1 = 0 + s1;
	String s2 = "";
	for(int i=s1.length()-1 ; i>=0 ; i--) {
		s2 = s2 + (s1.charAt(i));
	}
	System.out.println("binary conversion of "+ x +" :"+ s1);
	System.out.println("reverse of "+ x +" :"+ s2);

	if(s1.contentEquals(s2))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter no. to check : ");
		int n = sc.nextInt();
		
		isPalindrom(n);

	}

}
