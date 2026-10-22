class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek()[0] == ch) {
                stack.peek()[1]++;

                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } else {
                stack.push(new int[]{ch, 1});
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int[] pair : stack) {
            for (int j = 0; j < pair[1]; j++) {
                sb.append((char) pair[0]);
            }
        }

        return sb.toString();
    }
}