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
		    int n =  N + 1;
		    int[] arr = new int[n];
		    int[] arr2 = new int[N];
		    for(int i = 0; i < n; i++)
		    {
                arr[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n-1; i++)
		    {
		        int a = arr[i];
		        int b = arr[i+1];
		        int max = Math.max(a,b);
		        arr2[i] = max;
		    }
		    int min = arr2[0];
		    if(N > 1)
		    {
    		    for(int i = 1; i < N; i++)
    		    {
    		        if(arr2[i] < min)
    		        {
    		            min = arr2[i];
    		        }
    		    }
		    }
            System.out.println(min);
	    }

	}
}
