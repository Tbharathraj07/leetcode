class Solution {
    public String removeOuterParentheses(String s) {
        int depth=0;
        String ans="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch == '('){

                if(depth > 0){
                    ans+="(";
                }
                depth++;
            }
            else{
                depth--;
                if(depth > 0){
                    ans+=")";
                }
            }
        }
        return ans.toString();
    }
}