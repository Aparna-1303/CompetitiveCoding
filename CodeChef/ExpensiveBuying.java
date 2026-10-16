import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		if(testcases <= 100)
		{
		    while(testcases-- > 0)
		    {
    		    int items = sc.nextInt();
    		    int num_of_costly_items = sc.nextInt();
    		    int[] prices= new int[items];
    		    for(int i = 0; i < items; i++)
    		    {
                    prices[i] = sc.nextInt();
    		    }
        		Arrays.sort(prices);
        		int total = 0;
        		for(int i = items - 1; i >= items - num_of_costly_items; i--)
        		{
        		    total += prices[i];
        		}
                System.out.println(total);
		    }
		}
		
		sc.close();
	}
}
