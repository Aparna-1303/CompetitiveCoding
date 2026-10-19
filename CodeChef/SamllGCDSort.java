import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int[][] players = new int[N][2];
            for(int i = 1; i <= N; i++)
            {
                players[i - 1][0] = i;
                players[i - 1][1] = gcd(i, N);
            }
            Arrays.sort(players, (a, b)->{
                if(b[1] != a[1])
                return b[1] - a[1];
                return a[0] - b[0];
            });
            for(int i = 0; i < N; i++)
            {
                System.out.print(players[i][0]);
                if(i < N - 1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
	}
}
