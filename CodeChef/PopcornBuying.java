import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int left = x - 100;
		int y;
		if (left > 50)
		{
		    y = left / 50;
		    System.out.println(y);
		}
		else
		{
		    System.out.println(0);
		}

	}
}
