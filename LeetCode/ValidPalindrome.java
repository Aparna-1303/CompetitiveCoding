class Solution {
    public boolean isPalindrome(String s) {
        String replaced = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(replaced).reverse().toString();
        if(replaced.equals(reversed))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
