package strings;

import java.util.Scanner;

public class NoOfOcc {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a[] = new int[s.length()];
		for(int i=0; i<a.length;i++) {
			a[i]++;
		}
		boolean b[] = new boolean[a.length];
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j)) {
					a[i]++;
					b[j] = true;
				}
			}
			if(s.charAt(i)!=' ' && !b[i])
				System.out.println(s.charAt(i) +" : "+ a[i]);
		}
	}

}
