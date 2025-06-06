class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int dup=0;
        for(int i=0; i<nums.length; i++){
            int val=nums[i];
            if(!hs.contains(val)){
                hs.add(val);
            }else{
                dup=nums[i];
            }
        }
        int missingval=0;
            for(int i=0; i<=nums.length; i++){
                if(!hs.contains(i)){
                    missingval=i;
                }
            }
        int ans[]={dup,missingval};
        return ans;
        
    }
}