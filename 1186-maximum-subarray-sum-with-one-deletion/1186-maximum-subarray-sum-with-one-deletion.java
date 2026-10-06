class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = arr[0];
        int oneDelete = 0;
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            // Save current noDelete before updating it
            int prevNoDelete = noDelete;

            // Standard Kadane's algorithm for 0 deletions
            noDelete = Math.max(noDelete + arr[i], arr[i]);

            // Max between extending an existing deletion or deleting arr[i]
            oneDelete = Math.max(oneDelete + arr[i], prevNoDelete);

            // Track global max across all valid states
            maxSum = Math.max(maxSum, Math.max(noDelete, oneDelete));
        }

        return maxSum;
    }
}