package hackerank;

import java.util.*;
public class hr12 {
	
	private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        

        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            }
    }
    
    static int[] permutationEquation(int[] p) {
        int ans[] = new int[p.length];
        int t=0;
        for(int i=0; i<p.length; i++)
        {
            for(int j=0; j<p.length; j++)
            {
                if(i+1 == p[j]){
                for(int k=0; k<p.length; k++)
                {
                    if(j+1 == p[k])
                        ans[i]=k+1;
                }
            }
        }
    }
        return ans;
}
}
