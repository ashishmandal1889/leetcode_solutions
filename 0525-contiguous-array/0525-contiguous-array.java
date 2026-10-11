class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Base case: a difference of 0 happens before index 0 (at index -1)
        map.put(0, -1);
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }
            
            int diff = zero - one;
            
            // If we've seen this exact difference before, it means 
            // the subarray between that previous index and i has equal 0s and 1s
            if (map.containsKey(diff)) {
                ans = Math.max(ans, i - map.get(diff));
            } else {
                // Store the first time we see this difference to maximize length
                map.put(diff, i);
            }
        }
        return ans;
    }
}