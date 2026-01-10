import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        // Step 1: Greedy removal
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        // Step 2: Remove remaining digits from end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Step 3: Build result using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        // Step 4: Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Step 5: Handle empty result
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
