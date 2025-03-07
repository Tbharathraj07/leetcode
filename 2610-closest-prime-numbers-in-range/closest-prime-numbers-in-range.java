import java.util.*;

public class Solution {
    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        List<Integer> prime = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        
        if (prime.size() < 2) {
            return new int[]{-1, -1};
        } else {
            int ans = Integer.MAX_VALUE;
            int a = -1;
            int b = -1;
            
            for (int i = 0; i < prime.size() - 1; i++) {
                if (ans > prime.get(i + 1) - prime.get(i)) {
                    a = prime.get(i + 1);
                    b = prime.get(i);
                    ans = prime.get(i + 1) - prime.get(i);
                }
            }
            
            return new int[]{b, a}; 
        }
    }
}
