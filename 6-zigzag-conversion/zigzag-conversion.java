class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        
        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            
            for (int j = 0; j < numRows && i < s.length(); j++) {
                ans[j].append(s.charAt(i));
                i++;
            }
            
            for (int j = numRows - 2; j >= 1 && i < s.length(); j--) {
                ans[j].append(s.charAt(i));
                i++;
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder str : ans) {
            res.append(str);
        }
        return res.toString();
    }
}
