import java.util.Stack;

class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                if (!st.isEmpty()) st.pop(); // remove left non-digit
                // digit is skipped (removed)
            } else {
                st.push(c);
            }
        }

        // Build final string without StringBuilder
        String ans = "";
        for (char c : st) {
            ans = ans + c;  // concatenation allowed per your request
        }

        return ans;
    }
}
