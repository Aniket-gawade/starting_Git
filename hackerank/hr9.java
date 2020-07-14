//Time Conversion AM/PM to 24hr format
package hackerank;

import java.util.Scanner;

public class hr9 {
	
	public static String convert(String s)
	{
		int hr1 = s.charAt(0)-'0';
        int hr2 = s.charAt(1)-'0';
        int hr = hr1*10+hr2%10;

        String x = "";

        if(s.charAt(8) == 'A')
        {
            if(hr==12)
            {
                x+="00";
            for(int i=2; i<8; i++)
            {
                x+=s.charAt(i);
            }
            return x;
            }
            else
            {
            	if(hr1 ==0)
                {
                    x+="0";
                }
                x += String.valueOf(hr);
                for(int i=2; i<8; i++)
            {
                x+=s.charAt(i);
            }
            return x;
            }
        }
        else
        {
        	if(hr==12)
        	{
        		for(int i=0; i<8; i++)
                {
                    x+=s.charAt(i);
                }
                return x;
        	}
        	else
        	{
        		hr += 12;
        		x += String.valueOf(hr);
        		for(int i=2; i<8; i++)
                {
                    x+=s.charAt(i);
                }
                return x;
        	}
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = convert(s);
		System.out.println(result);
	}

}
