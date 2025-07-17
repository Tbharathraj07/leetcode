class Solution {
    public int numIdenticalPairs(int[] nums) {
        //HashMap<Integer,Integer>hm=new HashMap<>();
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]||nums[i]<nums[i]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}