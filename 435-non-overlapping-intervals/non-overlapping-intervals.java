class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // 1. Sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 1;
        int lastEndTime = intervals[0][1];

        // 2. Select non-overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= lastEndTime) {
                count++;
                lastEndTime = intervals[i][1];
            }
        }

        // 3. Minimum removals
        return intervals.length - count;
    }
}