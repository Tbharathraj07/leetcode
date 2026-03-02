class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1, b=-1, c=-1;
        int ans=0,maxcnt=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch == 'a'){
                a=i;
            }else if(ch == 'b'){
                b=i;
            }else if(ch == 'c'){
                c=i;
            }
            if(a != -1 && b != -1 && c != -1){
                maxcnt=Math.min(a,Math.min(b,c));
                ans+=(maxcnt+1);
            }
        }
        return ans;
    }
}