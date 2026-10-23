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
	        String s = sc.next();
	        int chef = 0;
	        int anti_chef = 0;
	        int ways = 0;
	        for(int i = 0; i < n; i++)
	        {
	            if(s.charAt(i) == '1')
	            {
	                chef++;
	            }
	            else
	            {
	                anti_chef++;    
	            }
	            if(chef > anti_chef)
	            {
	                ways++;
	            }
	        }
	        System.out.println(ways);
	        
	    }

	}
}
