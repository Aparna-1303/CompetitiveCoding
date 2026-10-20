class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m != n)
        {
            return false;
        }
        else
        {
            int[] freq = new int[26];
            for(int i = 0; i < m; i++)
            {
                freq[s.charAt(i) - 97]++;
            }
            for(int i = 0; i < n; i++)
            {
                freq[t.charAt(i) - 97]--;
            }
            for(int i = 0; i < 26; i++)
            {
                if(freq[i] != 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
} 
