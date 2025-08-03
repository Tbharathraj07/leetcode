class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int val : nums) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        for (int num : nums) {
            if (hm.get(num) == 1) {
                return num;
            }
        }
        return -1; 
    }
}
