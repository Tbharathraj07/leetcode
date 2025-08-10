class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int k=0;
        for(int val : nums){

            if(!hs.contains(val)){
                hs.add(val);
                nums[k]=val;
                k++;
            }
        }
        return k;
    }
}