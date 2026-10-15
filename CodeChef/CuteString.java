import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String args[]) throws java.lang.Exception
	{
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		if(S.length() != 3)
		{
		    System.out.println("No");
		    return;
		}
		for(int i = 0; i < S.length(); i++)
		{
		    if(S.charAt(i) < 'a' || S.charAt(i) > 'z')
		    {
		        System.out.println("No");
		        return;
		    }
		}

		if(S.charAt(0) == S.charAt(2) && S.charAt(1) == 'w')
		{
		    System.out.println("Cute");
		}
		else
		{
		    System.out.println("No");
		}

	}
}
