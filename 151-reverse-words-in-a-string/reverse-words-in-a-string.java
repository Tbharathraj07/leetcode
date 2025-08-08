class Solution {
    public String reverseWords(String s) {
        String[] words= s.split(" ");
        System.out.println(Arrays.toString(words));
        String res="";
        for(int i=words.length-1; i>=0; i--){
            if(words[i].length() > 0){
                res+=words[i];
                res += " ";
            }
        }
        return res.trim();
    }
}