class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();

        for (int num : nums) {
            //if (num > 0) {
                hs.add(num);
            //}
        }
        int n = nums.length;
        //System.out.println(n);
        int sum=0;
        int max=nums[0];
        for(int num:nums){
            if(num>max)
                max=num;
        }
        if(max<0)
            return 1;
        for(int i=1; i<=max; i++){
            if(!hs.contains(i)){
                sum = i;
                break;
            }
        }
        if(sum!=0)
            return sum;
        else
            return max+1;
    }
}