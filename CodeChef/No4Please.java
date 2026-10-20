import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            int[] a = new int[N];
            int c1 = 0, c2 = 0, c3 = 0;
            for(int i = 0; i < N; i++)
            {
                a[i] = sc.nextInt();
                if(a[i] == 1) 
                c1++;
                else if(a[i] == 2)
                c2++;
                else 
                c3++;
            }
            int option1 = c1;
            int option2 = c3;
            int option3 = Math.min(c2, 1);
            int option4 = c1 + Math.min(c2, 1);
            int option5 = c3 + Math.min(c2, 1);
            int maxKeep = Math.max(option1, Math.max(option2, Math.max(option3, Math.max(option4, option5))));
            int deletions = N - maxKeep;
            System.out.println(deletions);
        }

	}
}
