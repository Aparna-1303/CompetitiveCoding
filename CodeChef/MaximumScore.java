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
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];
		    int[] c = new int[n];
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n; i++)
		    {
		        b[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n; i++)
		    {
		        int sum = 0;
		        int num = b[i];
		        for(int j = 0; j < n; j++)
		        {
		            if(i == j)
		            {
		                continue;
		            }
		            else
		            {
		               sum += a[j]; 
		            }
 		        }
                sum += num;
                c[i] = sum;
		    }
		    int max = c[0];
		    for(int i = 1; i < n; i++)
		    {
		        if(c[i] > max)
		        {
		            max = c[i];
		        }
		    }
		    System.out.println(max);
		}

	}
}
