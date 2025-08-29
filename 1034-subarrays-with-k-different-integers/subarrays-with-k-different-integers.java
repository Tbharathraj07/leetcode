class Solution {

    private int atMost(int[] nums,int k){
        HashMap<Integer,Integer>hm=new HashMap<>();
        int left=0,cnt=0;

        for(int right=0; right < nums.length; right++){
            int val=nums[right];

            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>k ){
                int Left= nums[left];
                hm.put(Left,hm.get(Left)-1);
                if(hm.get(Left) == 0){
                    hm.remove(Left);
                }
                left++;
            }
            
                cnt+=(right-left+1);
        
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return atMost(nums,k)-atMost(nums,k-1);
    }
}