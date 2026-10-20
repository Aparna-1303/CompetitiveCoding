import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int Cars = sc.nextInt();
            int fastest = 0;
            int position = 0;
            for(int j = 0; j < Cars; j++)
            {
                int distance = sc.nextInt();
                int time = sc.nextInt();
                int speed = distance / time;
                if(j == 0)
                {
                    fastest = speed;
                }
                else{
                    if(speed > fastest)
                    {
                        fastest = speed;
                        position = j;
                    }
                }
            }
            System.out.println(position+1);
        }
	}
}
