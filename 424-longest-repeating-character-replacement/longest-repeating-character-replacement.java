class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer>hm=new HashMap<>();
        int left=0,maxfreq=0,maxcnt=0,maxlen=0;
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            hm.put(ch,hm.getOrDefault(ch,0)+1);

            maxcnt=Math.max(maxcnt,hm.get(ch));

            while(right - left + 1 - maxcnt > k){
                char Left=s.charAt(left);
                hm.put(Left, hm.get(Left)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}