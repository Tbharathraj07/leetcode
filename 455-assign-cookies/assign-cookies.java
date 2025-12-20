class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int left=0,right=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length; 
        int m=s.length;
        while(left < m && right < g.length){

            if(s[left] >= g[right]){
                right++;
            }
            left++;
        }
        return right;
    }
}