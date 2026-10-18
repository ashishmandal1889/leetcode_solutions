class Solution {
    public void reverseString(char[] s) {
        
        // int left = 0;
        // int right = s.length-1;
        // while(left<right){
        //     char temp = s[left];
        //     s[left] = s[right];
        //     s[right] = temp;
        //     left++;
        //     right--;
        // }
        //using stack 
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length;i++){
            stack.push(s[i]);
        }
        for(int i = 0;i<s.length;i++){
            s[i] = stack.pop();
        }
    }
}