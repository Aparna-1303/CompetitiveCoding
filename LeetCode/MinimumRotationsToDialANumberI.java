class Solution {
    public int minRotations(String s) {
        int current = 0;
        int total = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int target = s.charAt(i) - '0';
            int difference = Math.abs(target - current);
            int rotations = Math.min(difference, 10 - difference);
            total += rotations;
            current = target;
        }
        return total;
    }
}
