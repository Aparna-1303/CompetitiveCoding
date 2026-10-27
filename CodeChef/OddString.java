import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
		    int t = sc.nextInt();
		    while(t-- > 0)
		    {
		        int n = sc.nextInt();
		        String s = sc.next();
		        int[] arr = new int[26];
		        boolean possible = true;
		        for(int i = 0;i < n; i++)
		        {
		            int index = s.charAt(i) - 'a';
		            arr[index]++;
		            if(arr[index] > 2)
		            {
		                possible = false;
		                break;
		            }
		        }
		        if(possible)
		        {
		            System.out.println("Yes");
		        }
		        else
		        {
		            System.out.println("No");
		        }
		    }
		}

	}
}
