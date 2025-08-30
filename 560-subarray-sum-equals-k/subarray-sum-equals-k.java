import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: one way to get sum = 0
        int sum = 0, cnt = 0;

        for (int num : nums) {
            sum += num;

            // check if there was a prefix sum that makes subarray sum = k
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }

            // store/update current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}
