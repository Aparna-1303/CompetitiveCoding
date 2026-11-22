class Solution {
    public void sortColors(int[] nums) {
     int count_0 = 0;
     int count_1 = 0;
     int count_2 = 0;
     for(int i = 0; i < nums.length; i++)
     {
        if(nums[i] == 0)
        {
            count_0 ++;
        }
        else if(nums[i] == 1)
        {
            count_1 ++;
        }
        else
        {
            count_2 ++;
        }
     } 
    int counter = 0;
    for(int i = 0; i < count_0; i++)
    {
        nums[counter] = 0;
        counter++;
    }  
    for(int i = 0; i < count_1; i++)
    {
        nums[counter] = 1;
        counter++;
    }
    for(int i = 0; i < count_2; i++)
    {
        nums[counter] = 2;
        counter++;
    }
}
}
