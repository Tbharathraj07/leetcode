class Solution {
    public String reverseWords(String s) {
        
        String[] word=s.trim().split("\\s+");

        String result="";
        for(int i=word.length-1; i>=0; i--){
            result+=word[i];
            if(i != 0)result+=" ";
        }
        return result;
    }
}