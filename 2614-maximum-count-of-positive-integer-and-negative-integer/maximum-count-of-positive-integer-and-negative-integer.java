class Solution {
    private int leftMost(int []nums,int target){
        int low=0,high=nums.length-1;

        while(low <= high){
            int mid=low + (high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int maximumCount(int[] nums) {
        int zero=leftMost(nums,0);
        int one=leftMost(nums,1);
        int pos=nums.length-one;
        return Math.max(pos,zero);
    }
}