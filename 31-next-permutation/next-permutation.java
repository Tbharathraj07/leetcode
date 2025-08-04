import java.util.*;

class Solution {
    public void nextPermutation(int[] A) {
        int n = A.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            for (int l = 0, r = n - 1; l < r; l++, r--) {
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
            }
            return;
        }
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                int temp = A[i];
                A[i] = A[ind];
                A[ind] = temp;
                break;
            }
        }

        int l = ind + 1, r = n - 1;
        while (l < r) {
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
    }
}
