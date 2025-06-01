class Solution {
    public long distributeCandies(int n, int limit) {
        long total = comb(n + 2, 2);

        // Subtract cases where at least one child gets more than limit
        long bad = 0;

        // Inclusion-Exclusion over 1, 2, 3 children exceeding the limit
        for (int mask = 1; mask < 8; mask++) {
            int bits = Integer.bitCount(mask);
            int subtract = bits * (limit + 1);
            int rem = n - subtract;

            if (rem < 0) continue;

            long ways = comb(rem + 2, 2);

            if (bits % 2 == 1)
                bad += ways;
            else
                bad -= ways;
        }

        return total - bad;
    }

    // nCk using long and math formula
    static long comb(int n, int k) {
        if (n < k) return 0;
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res *= (n - i + 1);
            res /= i;
        }
        return res;
    }
        
}