#include <stdio.h>

int main() {
	int testcases;
	scanf("%d", &testcases);
	while(testcases--)
	{
	    int start_position, dice_number;
	    scanf("%d %d", &start_position, &dice_number);
	    int target_number = 50 - start_position;
	    int min_roll_sum = 2 * dice_number;
	    int max_roll_sum = 2 * dice_number + 10;
	    if(target_number >= min_roll_sum && target_number <= max_roll_sum)
	    {
	        printf("Yes\n");
	    }
	    else
	    {
	        printf("No\n");
	    }
	}
 }
