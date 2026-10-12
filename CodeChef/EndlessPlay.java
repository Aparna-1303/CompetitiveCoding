import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int date;
		int hours;
		int count_hours = 0;
		int total_hours = 0;
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();
        hours = sc.nextInt();
        if(date >= 4 && date <= 30)
        {
            count_hours = (date - 4) * 24;
        }
        total_hours = count_hours + hours;
        System.out.println(total_hours);
       }
}
