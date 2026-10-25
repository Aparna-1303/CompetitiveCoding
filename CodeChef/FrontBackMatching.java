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
		    String result = "";
		    boolean value = false;
		    for(int i = 0; i < n; i++)
		    {
		        char l = s.charAt(i);
		        result += Character.toLowerCase(l);
		    }
            for(int i = 0; i < n; i++)
            {
                char m = result.charAt(i);
                int count = 0;
                for(int j = 0; j < n; j++)
                {
                    if(result.charAt(j) == m)
                    {
                        count ++;
                    }
                    if(count > 1)
                    {
                       value = true;
                       break;
                    }
                }
            }
            if(value)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
		}

	}
}
