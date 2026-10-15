class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int k = x;
        while(x > 0)
        {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10; 
        }
        if(k == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
