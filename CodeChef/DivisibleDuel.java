import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        int start, last;
        while(testCases-- > 0)
        {
            start = sc.nextInt();
            last = sc.nextInt();
            int S_even = 0, S_odd = 0;
            if(start <= 100 && last <= 100)
            {
                for(int i = start; i <= last; i++)
                {
                    if(i % start == 0)
                    {
                        if(i % 2 == 0)
                        {
                            S_even += i;
                        }
                        else
                        {
                            S_odd += i;
                        }
                    }
                }
            }
            if(S_even >= S_odd)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
