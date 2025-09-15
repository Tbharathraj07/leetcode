class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs=new HashSet<>();
        int left=0,maxlen=0;
        
        for(int right=0; right<s.length(); right++){
            char ch=s.charAt(right);

            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(ch);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}