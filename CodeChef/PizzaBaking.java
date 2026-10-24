import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int extra = m - n;
		int happy;
		if(extra < n)
		{
		    happy = extra;
		}
		else
		{
		    happy = n;
		}
		System.out.println(happy);
	}
}
