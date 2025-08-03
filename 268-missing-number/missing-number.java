class Solution {
    public int missingNumber(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int val = nums[i];

            hs.add(val);
        }
        int n=nums.length;
        int ans=0;
        for(int i=1; i<=n; i++){
            if(!hs.contains(i)){
                hs.add(i);
                ans=i;
            }
        }
        return ans;
    }
}