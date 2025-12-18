class Solution {
    private int atListS(int nums[],int k){

        int left=0,cnt=0,sum=0;

        for(int right=0; right<nums.length; right++){
            if (nums[right] % 2 == 1) sum++;

            while(sum > k){
                if(nums[left]%2==1){
                    sum--;
                }
                left++;
            }
            cnt+=right-left+1;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atListS(nums,k)- atListS(nums,k-1);
        
    }
}