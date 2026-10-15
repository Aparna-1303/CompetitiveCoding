import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();
        while(Testcase -- > 0)
        {
             int N = sc.nextInt();
             int K = sc.nextInt();
             System.out.println(minMoves(N, K));
        }
	}
	private static int minMoves(int N, int K)
	{
	    if(K == N)
	    return 0;
	    boolean[] visited = new boolean[N + 1];
	    Queue<int[]>q = new LinkedList<>();
	    q.add(new int[]{K, 0});
	    visited[K] = true;
	    while(!q.isEmpty())
	    {
	        int[] cur = q.poll();
	        int pos = cur[0];
	        int moves = cur[1];
	        int[] next = {pos - 1, pos + 1, N + 1 - pos};
	        for(int nxt : next)
	        {
	            if(nxt >= 1 && nxt <= N && !visited[nxt])
	            {
	                if(nxt == N)
	                return moves + 1;
	                visited[nxt] = true;
	                q.add(new int[]{nxt, moves + 1});
	            }
	        }
	    }
	    return - 1;
	}
	
}
