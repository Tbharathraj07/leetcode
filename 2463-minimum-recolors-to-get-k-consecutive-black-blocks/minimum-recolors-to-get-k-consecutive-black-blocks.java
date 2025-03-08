class Solution {
    public int count(String s) {
        int cnt = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'W') {
                cnt++;
            }
        }
        return cnt;
    }
    
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - k; i++) {
            String s = blocks.substring(i, i + k);
            int x = count(s);
            ans = Math.min(ans, x);
        }
        
        return ans;
    }
}
