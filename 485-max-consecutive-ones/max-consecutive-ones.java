class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxlen=0;
        int maxi=0;

       for(int i=0; i<nums.length; i++){
           int val=nums[i];

           if(val == 1){
              maxlen++;
           }else{
              maxlen=0;
           }
           
           if(maxlen > maxi){
              maxi = maxlen;
           }
       }
       return maxi;
    }
}