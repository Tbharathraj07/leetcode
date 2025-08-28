class Solution {
    public int atMostK(int []nums, int k){
       int left=0,sum=0,cnt=0;
        if(k < 0) return 0;
       for(int right=0; right<nums.length; right++){

            sum+=nums[right];

            while(sum > k){
                sum-=nums[left];
                left++;
            }
            cnt=cnt+right-left+1;
       }
       return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMostK(nums,goal)-atMostK(nums,goal-1);
    }
}