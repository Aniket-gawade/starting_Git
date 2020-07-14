package strings;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		
		l =l.replaceAll("\\s", "");
		System.out.println(l);

	}

}
