class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> freq = new HashMap<>();

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);

                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for (int count : freq.values()) {
                    maxFreq = Math.max(maxFreq, count);
                    minFreq = Math.min(minFreq, count);
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }
        return totalBeauty;

        
    }
}