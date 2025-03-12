class Solution {
    public int LeftMost(int nums[], int target){
        int l=0;
        int r=nums.length-1;
        int mid=0;

        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
          return l;
    }
    public int maximumCount(int[] nums) {
       int neg = LeftMost(nums,0);
       int one= LeftMost(nums,1);
       int pos=nums.length-one;
       return Math.max(neg,pos);
    }
}