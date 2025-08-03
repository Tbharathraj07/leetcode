class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int posIdx=0;
        int negIdx=1;
        int ans[]= new int[nums.length];
        for(int num : nums){
            if(num > 0){
                ans[posIdx]=num;
                posIdx+=2;
            }
            else{
                ans[negIdx]=num;
                negIdx+=2;
            }
        }
    return ans;
    }
}