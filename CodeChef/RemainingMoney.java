import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int chef_money, ice_creams, icecream_cost, total_cost, money_left;
		Scanner sc = new Scanner(System.in);
	    chef_money = sc.nextInt();
		if(chef_money <= 1000)
		{
		    ice_creams = sc.nextInt();
		    icecream_cost = sc.nextInt();
		    if(ice_creams <= 100 && icecream_cost <= 100)
		    {
                total_cost = ice_creams * icecream_cost;
    		    if(total_cost <= chef_money)
	    	    {
		            money_left = chef_money - total_cost;
		            System.out.println(money_left);
		        }
    		}
		}
	}
}
