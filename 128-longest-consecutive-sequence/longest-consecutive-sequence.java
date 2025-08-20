class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int cnt=0;
        if(n==0) return 0;
        HashSet <Integer> hs=new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }

        int longest=1;

        for(int num : hs){
            if(!hs.contains(num -1)){
                cnt=1;
                int x=num;

                while(hs.contains(x+1)){
                    x=x+1;
                    cnt++;

                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}