class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char x : s.toCharArray()){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }

        for(char x : t.toCharArray()){
            
            if(!hm.containsKey(x)){
                return false;
            }

            hm.put(x,hm.get(x)-1);

            if(hm.get(x) < 0){
                return false;
            }
        }
        return true;
    }
}