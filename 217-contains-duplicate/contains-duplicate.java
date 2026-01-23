class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int x : nums){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }

        for(int i : nums){
            if(hm.get(i) > 1){
                return true;
            }
        }
        return false;
    }
}