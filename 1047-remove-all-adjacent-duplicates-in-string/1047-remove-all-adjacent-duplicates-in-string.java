import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If stack is not empty and top matches current character, remove the duplicate
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                // Otherwise, push the character onto the stack
                stack.push(ch);
            }
        }
        
        // Build the final result string from the stack
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}