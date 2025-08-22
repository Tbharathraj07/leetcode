class Solution {
    public String solve(String s,int left,int right){
        String res="";
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            String odd=solve(s,i,i);
            //System.out.println(odd);
            if(ans.length()<odd.length())
            {
                ans=odd;
            }
        }
        for(int i=0;i<n-1;i++){
            String even=solve(s,i,i+1);
            //System.out.println(even);
            if(even.length()>ans.length())
                ans=even;
        }
        return ans;
    }
}