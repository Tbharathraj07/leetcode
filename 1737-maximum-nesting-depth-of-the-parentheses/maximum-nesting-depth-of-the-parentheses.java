class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int maxcnt=0; 
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch == '('){
                cnt++;
                maxcnt=Math.max(maxcnt,cnt);
            }else if(ch == ')'){
                cnt--;
            }
        }
        return maxcnt;
    }
}