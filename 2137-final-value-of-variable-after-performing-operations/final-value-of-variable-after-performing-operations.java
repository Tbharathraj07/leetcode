class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans =0;
        for(int i=0; i<operations.length; i++){
            String temp=operations[i];
            if(temp.equals("++X") || temp.equals("X++")){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
}