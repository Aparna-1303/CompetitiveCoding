class Solution {
    public int[] findErrorNums(int[] nums) {
       int big = nums.length;
       int total = (big * (big + 1)) / 2;
       int given_total = 0;
       int repeated = 0; 
       boolean[] seen = new boolean[big+1];
       for(int i = 0; i < big; i++)
       {
        given_total += nums[i];
       if(seen[nums[i]])
       {
        repeated = nums[i];
       }
       seen[nums[i]] = true;
       } 
       int missing = total - (given_total - repeated);
       return new int[]{repeated, missing};
    }
}
