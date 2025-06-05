class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(int i=0; i<stones.length(); i++){
            char ch=stones.charAt(i);
            for (int j=0; j<jewels.length(); j++){
                char dia=jewels.charAt(j);
                if(ch == dia){
                    cnt++;
                }
            }
        }
        return cnt;    
    }
}