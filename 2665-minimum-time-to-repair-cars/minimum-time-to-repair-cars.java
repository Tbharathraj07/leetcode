import java.util.*;

class Solution {
    private boolean canRepair(int[] ranks, int cars, long mid) {
        long totalCars = 0;
        for (int r : ranks) {
            if (mid < r) continue;
            totalCars += (long) Math.sqrt((double) mid / r);
            if (totalCars >= cars) return true;
        }
        return totalCars >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = (long) Arrays.stream(ranks).min().getAsInt() * (long) cars * cars;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepair(ranks, cars, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
