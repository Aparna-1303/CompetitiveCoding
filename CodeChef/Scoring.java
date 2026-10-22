import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int AliceScore = (X + Y)/2;
		    int BobScore = Y - AliceScore;
		    System.out.print(AliceScore + " " + BobScore);
		    System.out.println();
		}

	}
}
