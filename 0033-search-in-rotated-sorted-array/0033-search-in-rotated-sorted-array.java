class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        
        while (low <= high) {
            int guess = (low + high) / 2;
            
            if (nums[guess] == target) {
                return guess;
            }
            
            
            if (nums[guess] >= nums[0]) {
                if (target >= nums[0] && target < nums[guess]) {
                    high = guess - 1;
                } else {
                    low = guess + 1;
                }
            } 
            
            else {
                if (target > nums[guess] && target <= nums[n - 1]) {
                    low = guess + 1;
                } else {
                    high = guess - 1;
                }
            }
        }
        
        return -1;
    }
}