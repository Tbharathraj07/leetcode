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
            reverse(A, 0, n - 1);
            return;
        }

        
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                swap(A, i, ind);
                break;
            }
        }
        reverse(A, ind + 1, n - 1);
    }
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
