class Solution {

    private boolean isPossible(int[] bloomDay, int m, int k, int day) {
        int took = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                took++;
            } else {
                took = 0;
            }

            if (took == k) {
                m--;
                took = 0;
            }

            if (m == 0) {
                return true;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        // if ((long) m * k > bloomDay.length) {
        //     return -1;
        // }

        int low = 1;
        int high = (int)Math.pow(10,9);
        int ans=-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
