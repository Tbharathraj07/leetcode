import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count characters in s
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Check characters in t
        for(char cm : t.toCharArray()) {
            if(!map.containsKey(cm) || map.get(cm) == 0) {
                return cm; // Extra character found
            }
            map.put(cm, map.get(cm) - 1);
        }
        
        return ' '; // Should never reach here
    }
}
