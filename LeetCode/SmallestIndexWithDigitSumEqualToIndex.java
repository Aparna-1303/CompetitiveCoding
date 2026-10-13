class Solution {
    public int smallestIndex(int[] nums) {
        int[] same = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            int rem = 0;
            int sum = 0;
            int n = nums[i];
            while(n > 0)
            {
                rem = n % 10;
                sum += rem;
                n /= 10;
            }
            if(sum == i)
            {
                same[k] = i;
                k++;  
            }
        }
        if(k == 0)
        {
            return -1;
        }
        else
        {   
            int small = same[0];
            for(int i = 0; i < k; i++)
            {
                if (small > same[i])
                {
                    small = same[i];
                }
            }
            return small;
        }
    }
}
