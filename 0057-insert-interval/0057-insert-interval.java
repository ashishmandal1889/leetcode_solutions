class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // 1. Add all intervals that come strictly before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // 2. Merge all overlapping intervals with the new interval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval); // Add the merged interval

        // 3. Add all remaining intervals that come after
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        // Convert List to 2D array and return
        return ans.toArray(new int[ans.size()][]);
    }
}