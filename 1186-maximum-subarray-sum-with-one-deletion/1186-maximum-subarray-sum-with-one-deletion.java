class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = arr[0];
        int oneDelete = 0; // At index 0, 1 deletion would leave an empty subarray
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            // Take the optimal max between deleting arr[i] or keeping arr[i] after a prior deletion
            oneDelete = Math.max(oneDelete + arr[i], noDelete);
            
            // Standard Kadane's logic
            noDelete = Math.max(noDelete + arr[i], arr[i]);

            // Update global maximum
            maxSum = Math.max(maxSum, Math.max(noDelete, oneDelete));
        }

        return maxSum;
    }
}