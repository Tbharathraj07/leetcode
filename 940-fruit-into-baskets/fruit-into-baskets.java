class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int left=0,maxlen=0;

        for(int right =0; right<fruits.length; right++){
            int val=fruits[right];
            hm.put(val,hm.getOrDefault(val,0)+1);

            while(hm.size() > 2){
                int Left=fruits[left];
                hm.put(Left,hm.get(Left)-1);
                if(hm.get(Left)==0){
                    hm.remove(Left);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}