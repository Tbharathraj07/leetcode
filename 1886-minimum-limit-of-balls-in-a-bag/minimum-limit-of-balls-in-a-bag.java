class Solution {
    private boolean isPossible(int[] nums,int maxOperations, int k){
        int temp=0;
        for(int i=0; i<nums.length; i++){
            int num=nums[i];

            temp=num/k;
            
            if(num % k !=0){
                temp++;
            }
            temp-=1;
            maxOperations-=temp;

            if(maxOperations < 0){
                return false;
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=Integer.MAX_VALUE;

        while(low <= high){
            int mid=low + (high-low)/2;

            if(isPossible(nums,maxOperations,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
} 