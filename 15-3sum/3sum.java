class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        HashSet<ArrayList<Integer>> ans= new HashSet<>();
        for(int i=0; i<nums.length; i++){
             HashSet<Integer> hs= new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int third = -(nums[i]+nums[j]);
                if(hs.contains(third)){
                    ArrayList<Integer> st=new ArrayList<>();
                    st.add(nums[i]);
                    st.add(nums[j]);
                    st.add(third);
                    Collections.sort(st);
                    ans.add(st);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> i : ans){
            //System.out.println(i);
            result.add(new ArrayList<>(i)); 
        }
        return result;
    }
}