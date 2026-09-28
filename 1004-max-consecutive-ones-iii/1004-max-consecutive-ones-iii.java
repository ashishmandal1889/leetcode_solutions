class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            // Count zero
            if (nums[right] == 0) {
                zeros++;
            }

            // If zeros > k, shrink the window
            while (zeros > k) {

                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            // Calculate current window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}