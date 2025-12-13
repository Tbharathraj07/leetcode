class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       HashMap<Integer,Integer>hm=new HashMap<>();

       for(int i=0; i<nums.length; i++){
            int num=nums[i];

            int Target=target-num;

            if(hm.containsKey(Target)){
                return new int[]{hm.get(Target),i};
            }

            hm.put(num,i);
       }
       return new int[]{-1,-1};
    }
}