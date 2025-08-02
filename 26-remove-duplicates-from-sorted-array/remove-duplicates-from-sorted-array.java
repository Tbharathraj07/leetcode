class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int k=0;
        for(int i=0; i<nums.length; i++){
            int val=nums[i];

            if(!hs.contains(val)){
                hs.add(val);
                nums[k]=val;
                k++;
            }
        }
        return k;
    }
}