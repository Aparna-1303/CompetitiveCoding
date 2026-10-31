import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int effective_amount = 0;
		if(x >= 200)
		{
		    effective_amount = x - 50;
		}
		else
		{
		    effective_amount = x;
		}
        System.out.println(effective_amount);
	}
}
