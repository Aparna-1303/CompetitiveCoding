class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        for(int i = 0; i  < n; i++)
        {
            Arrays.sort(intervals, (a, b)->a[0] - b[0]);
        }
        int[][] result = new int[n][2];
        int j = 0;
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];
        for(int i = 0; i < n; i++)
        {
            if(intervals[i][0] <= result[j][1])
            {
                result[j][1] = Math.max(result[j][1], intervals[i][1]);
            }
            else
            {
                j++;
                result[j][0] = intervals[i][0];
                result[j][1] = intervals[i][1];
            }
        }
        int[][] answer = new int[j + 1][2];
        for(int i = 0; i <= j; i++)
        {
            answer[i][0] = result[i][0];
            answer[i][1] = result[i][1];
        }
        return answer;
    }
}
