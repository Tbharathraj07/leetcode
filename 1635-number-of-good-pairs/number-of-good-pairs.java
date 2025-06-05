class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();

        int cnt=0;
        for(int num : nums){
            if(hm.containsKey(num)){
                cnt+=hm.get(num);
                hm.put(num,hm.getOrDefault(num,0)+1);
            }else{
                hm.put(num,1);
            }
        }
        return cnt;
    }
}