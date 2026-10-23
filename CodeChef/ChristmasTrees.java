import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int M = sc.nextInt();
		int B = sc.nextInt();
		int purchase = N * A;
		int sale = M * B;
		int x = sale - purchase;
		System.out.println(x);

	}
}
