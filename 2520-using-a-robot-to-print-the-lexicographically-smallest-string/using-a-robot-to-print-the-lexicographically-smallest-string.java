import java.util.*;

class Solution {
    public String robotWithString(String s) {
        // Step 1: Build frequency map
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Simulate
        StringBuilder result = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // Push to stack
            stack.push(c);

            // Decrease freq of c
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) {
                freq.remove(c);
            }

            // Check if we can pop from stack
            while (!stack.isEmpty() && canPop(stack.peek(), freq)) {
                result.append(stack.pop());
            }
        }

        // Pop remaining stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    private boolean canPop(char top, HashMap<Character, Integer> freq) {
        // If no smaller character remains, we can pop
        for (char c = 'a'; c < top; c++) {
            if (freq.containsKey(c)) {
                return false; // smaller character still remains → can't pop
            }
        }
        return true;
    }
}
