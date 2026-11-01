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
		    int b = sc.nextInt();
		    int g = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int n = sc.nextInt();
		    if(x+y > n)
		    {
		        System.out.println(-1);
		        continue;
		    }
		    double total = b + g;
		    int rooms = (int)Math.ceil(total/n);
		    int boys = b / x;
		    int girls = g / y;
		    int max = Math.min(boys, girls);
		    if(max >= rooms)
		    {
		        System.out.println(rooms);
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		}

	}
}
