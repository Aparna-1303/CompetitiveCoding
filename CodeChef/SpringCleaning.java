import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int small_rooms = sc.nextInt();
		int large_rooms = sc.nextInt();
		int time_for_small = small_rooms * 30;
		int time_for_large = large_rooms * 60;
		int total_time = time_for_small + time_for_large;
		System.out.println(total_time);

	}
}
