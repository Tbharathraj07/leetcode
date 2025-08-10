class Solution {
    public String removeOuterParentheses(String s) {
        
        String res="";
        int depth=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == '('){
                if(depth > 0){
                    res+=ch;
                }
                depth++;
            }else{
                depth--;
                if(depth > 0){
                    res+=ch;
                }
            }
        }
        return res.toString();
    }
}