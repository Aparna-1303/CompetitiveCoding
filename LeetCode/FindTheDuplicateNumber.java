class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int repeated = 0;
        int[] count = new int[n];
        for(int i = 0; i < n; i++)
        {
           count[nums[i] - 1]++;
            if (count[nums[i] - 1] > 1)
            {
                repeated = nums[i];
            }
        }
        return repeated;
    }
}
