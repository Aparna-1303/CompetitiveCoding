import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int[] cost = new int[N];
            for(int i = 0; i < N; i++)
            {
                cost[i] = sc.nextInt();
            }
            int minSum = cost[0] + cost[1];
            int index = 0;
            for(int i = 1; i < N-1; i++)
            {
                int currentSum = cost[i] + cost[i+1];
                if(currentSum < minSum)
                {
                    minSum = currentSum;
                    index = i;
                }
            }
            System.out.println(minSum);
        }
	}
}
