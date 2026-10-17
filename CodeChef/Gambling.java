import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int first_dice_number, required_move, win = 7;
		Scanner sc = new Scanner(System.in);
		first_dice_number = sc.nextInt();
		required_move = win - first_dice_number;
		System.out.println(required_move);
	}
}
