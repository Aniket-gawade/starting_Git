//Anagram of Strings

package strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string1 :");
		String s1 = sc.nextLine();
		System.out.println("enter string2 :");
		String s2 = sc.nextLine();
		int ar[]= new int[256];
		boolean isanagram = true;
		if(s1.length()!=s2.length())
			System.out.println("not Anagram");
		else{
			
			for(char c : s1.toCharArray())
			{
				int inx = (int)c;
				ar[inx]++;
			}
			
			for(char c : s2.toCharArray())
			{
				int inx = (int)c;
				ar[inx]--;
			}
			
			for(int i=0;i<256;i++)
			{
				if(ar[i] != 0) {
					isanagram = false;
					break;
				}
			}
			
		if(isanagram)
			System.out.println("yes anagram!");
		else
		System.out.println("not anagram!");
		
		}
	}

}
