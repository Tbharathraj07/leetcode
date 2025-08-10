class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            char orginal=s.charAt(i);
            char replacement=t.charAt(i);

            if(!hm.containsKey(orginal)){
                if(!hm.containsValue(replacement)){
                    hm.put(orginal,replacement);
                }else{
                    return false;
                }
            }else{
                char ch=hm.get(orginal);
                if(ch != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}