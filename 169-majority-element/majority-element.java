import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans=nums.length/2;
        return nums[ans];
    }
}
