class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;     
        long streak = 0;

        for (int x : nums) {
            if (x == 0) {
                streak++;   
                ans += streak;
            } else {
                streak = 0;
            }
        }
        return ans;
    }
}
