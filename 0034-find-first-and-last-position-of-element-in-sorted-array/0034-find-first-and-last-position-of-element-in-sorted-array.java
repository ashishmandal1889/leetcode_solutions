class Solution {

    public int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        if (nums == null || nums.length == 0) {
            return result;
        }

        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }

    // Find first occurrence
    private int findFirst(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {

            int guess = low + (high - low) / 2;

            if (nums[guess] >= target) {
                high = guess - 1;
            } else {
                low = guess + 1;
            }

            if (nums[guess] == target) {
                index = guess;
            }
        }

        return index;
    }

    // Find last occurrence
    private int findLast(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {

            int guess = low + (high - low) / 2;

            if (nums[guess] <= target) {
                low = guess + 1;
            } else {
                high = guess - 1;
            }

            if (nums[guess] == target) {
                index = guess;
            }
        }

        return index;
    }
}