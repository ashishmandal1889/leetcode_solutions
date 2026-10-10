class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for (int num : nums) {
            totalsum += num;
        }
        
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Right sum is total sum minus left sum minus the current element
            int rightsum = totalsum - leftsum - nums[i];
            
            // Check if left sum equals right sum
            if (leftsum == rightsum) {
                return i;
            }
            
            // Add current element to leftsum *after* the check for the next iteration
            leftsum += nums[i];
        }
        
        return -1;
    }
}