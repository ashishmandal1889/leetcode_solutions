import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        int zero = 0;
        int one = 0;
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        // Base case: a difference of 0 is conceptually at index -1
        map.put(0, -1); 
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }
            
            int diff = zero - one;
            
            if (map.containsKey(diff)) {
                ans = Math.max(ans, i - map.get(diff));
            } else {
                // Only store the first time we see this difference to maximize length
                map.put(diff, i);
            }
        }
        return ans;
    }
}