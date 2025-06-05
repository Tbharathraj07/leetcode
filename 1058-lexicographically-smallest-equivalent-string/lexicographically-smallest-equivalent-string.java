class Solution {
    int[] parent = new int[26];  // parent[i] = representative of character 'a' + i

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        // Step 1: Initialize DSU so that each character is its own parent
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        // Step 2: Union the characters from s1 and s2
        for (int i = 0; i < s1.length(); i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        // Step 3: Build the result string using the smallest representative
        StringBuilder res = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            res.append((char)(find(c - 'a') + 'a'));
        }

        return res.toString();
    }

    // Find with path compression
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union keeping smallest lexicographical character as leader
    private void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) return;

        if (px < py) {
            parent[py] = px;
        } else {
            parent[px] = py;
        }
    }
}
