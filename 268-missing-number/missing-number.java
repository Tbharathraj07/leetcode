class Solution {
    public int missingNumber(int[] nums) {
      HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int val=nums[i];
            hs.add(val);
        }
        int ans=0;
        int n=nums.length;
        for(int i=0; i<=n; i++){
            if(!hs.contains(i)){
                ans=i;               
            }
        }
        return ans;
    }
}