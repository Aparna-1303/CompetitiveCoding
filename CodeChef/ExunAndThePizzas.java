import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int pizzas = sc.nextInt();
        int K_pizzas = sc.nextInt();
        int Cost = sc.nextInt();
        int pizzas_left = pizzas - K_pizzas;
        int remaining_amount = pizzas_left * Cost;
        System.out.println(remaining_amount);

	}
}
