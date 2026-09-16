class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            sum += nums[right];

            // Shrink while the window is valid
            while (sum >= target) {

                int currentLength = right - left + 1;
                minLength = Math.min(minLength, currentLength);

                sum -= nums[left];
                left++;
            }
        }

        // No valid subarray was found
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}