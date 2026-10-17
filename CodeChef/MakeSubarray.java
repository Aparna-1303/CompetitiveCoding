import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0)
        {
            int num_of_cells = sc.nextInt();
            String s = sc.next();
            int first = -1, last = -1;
            for(int i = 0; i < num_of_cells; i++)
            {
                if(s.charAt(i) == '1')
                {
                    if(first == -1)
                    {
                        first = i;
                    }
                    last = i;
                }
            }
            if(first == -1)
            {
                System.out.println(0);
                continue;
            }
            int changes = 0;
            for(int i = first; i <= last; i++)
            {
                if(s.charAt(i) == '0')
                    changes++;
            }
            System.out.println(changes);
        }
        sc.close();
	}
}
