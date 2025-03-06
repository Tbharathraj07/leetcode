import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length; // Size of the grid
        int[] B = new int[n * n]; // Flattened array
        int k = 0;
        
        // Flatten the grid into a 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[k++] = grid[i][j];
            }
        }
        
        // Variables to store the sum of the numbers
        long expectedSum = 0, expectedSumOfSquares = 0;
        long actualSum = 0, actualSumOfSquares = 0;

        // Calculate the expected sum and sum of squares for numbers 1 to n^2
        for (int i = 1; i <= n * n; i++) {
            expectedSum += i;
            expectedSumOfSquares += (long) i * i;
        }

        // Calculate the actual sum and sum of squares from the grid
        for (int i = 0; i < n * n; i++) {
            actualSum += B[i];
            actualSumOfSquares += (long) B[i] * B[i];
        }

        // The difference in sums and squares gives us the repeated and missing numbers
        long diffSum = expectedSum - actualSum; // b - a
        long diffSumOfSquares = expectedSumOfSquares - actualSumOfSquares; // b^2 - a^2

        // Now, use the formula:
        // (b - a) = diffSum
        // (b^2 - a^2) = diffSumOfSquares
        // (b + a) * (b - a) = diffSumOfSquares
        // So, (b + a) = diffSumOfSquares / diffSum
        long sumOfNumbers = diffSumOfSquares / diffSum;
        
        // Now we can solve for b and a
        int a = (int) ((sumOfNumbers - diffSum) / 2);
        int b = (int) (a + diffSum);

        // Return the result as an array [a, b]
        return new int[] {a, b};
    }
}
