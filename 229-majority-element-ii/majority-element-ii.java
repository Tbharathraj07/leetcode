class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>ls=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();

        int n=(nums.length/3)+1;
        for(int x : nums){
            hm.put(x, hm.getOrDefault(x,0)+1);

            if(hm.get(x) == n){
                ls.add(x);
            }

            if(ls.size()==2)break;
        }
        Collections.sort(ls);
        return ls;
    }
}