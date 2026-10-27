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
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int count = 0;
	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        boolean wearing = false;
	        for(int i = 0; i < n; i++)
	        {
	            if(arr[i] < a)
	            {
	                if(!wearing)
	                {
	                    count++;
	                    wearing = true;
	                }
	            }
	            else if(arr[i] > b)
	            {
	                wearing = false;
	            }
	        }
	        System.out.println(count);
	    }

	}
}
