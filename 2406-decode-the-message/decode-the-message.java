class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character,Character>hm=new HashMap<>();
        int temp=97;
        for(int i=0; i<key.length(); i++){
            char ch=key.charAt(i);
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch,(char)temp);
                temp++;
            }
        }
        String ans="";
        for(int i=0; i<message.length(); i++){
            char n=message.charAt(i);
            if(n != ' '){
               char val= hm.get(n);
               ans+=val;
            }else{
                ans+=' ';
            }
        }
        return ans;
    }
}