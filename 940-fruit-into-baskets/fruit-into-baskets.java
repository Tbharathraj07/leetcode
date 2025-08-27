class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int left=0,len=0,maxlen=0;

        for(int right=0; right<fruits.length; right++){
            int val=fruits[right];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size() > 2){
                int leftVal = fruits[left];
                hm.put(leftVal, hm.get(leftVal) - 1);
                if (hm.get(leftVal) == 0) {
                    hm.remove(leftVal);
                }
                left++;
            }
            
            len=right-left+1;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}