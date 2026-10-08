class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSubarraySum = 0;
        int minSubarraySum = 0;
        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {
            currentMax = Math.max(num, currentMax + num);
            maxSubarraySum = Math.max(maxSubarraySum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSubarraySum = Math.min(minSubarraySum, currentMin);
        }

        return Math.max(maxSubarraySum, Math.abs(minSubarraySum));
    }
}