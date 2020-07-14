package hackerank;

import java.util.*;
public class hr13 {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int result = equalizeArray(arr);

	        System.out.println(result);
	        scanner.close();
	    }
	    
	    static int equalizeArray(int[] arr) {
	        int ans=0;
	        int r=0;
	        for(int i=0; i<arr.length; i++)
	        {
	            int t=0;
	            for(int j=0; j<arr.length; j++)
	            {
	                if(arr[i] == arr[j])
	                    t++;
	            }
	            if(t>=r)
	                r=t;
	        }
	        return arr.length-r;
	    }
}
