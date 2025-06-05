import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        for (int num : hm.keySet()) {
            if (hm.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }
}
