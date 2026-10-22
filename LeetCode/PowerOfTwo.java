class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0; i <= 30; i++)
        {
            int value = (int)Math.pow(2, i);
            if(value == n)
            {
                return true;
            }
            if(value > n)
            {
                return false;
            }
        }
        return false;
    }
}
