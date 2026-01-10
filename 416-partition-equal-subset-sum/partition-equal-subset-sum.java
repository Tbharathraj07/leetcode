class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        // If sum is odd, cannot partition
        if (sum % 2 != 0) return false;

        int target = sum / 2;

        // dp[j] = can we form sum j using some elements
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }
}
