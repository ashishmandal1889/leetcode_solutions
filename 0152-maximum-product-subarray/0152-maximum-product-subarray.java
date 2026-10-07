class Solution {
    public int maxProduct(int[] nums) {
        int currentmax = nums[0];
        int currentmin = nums[0];
        int maxproduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int oldMax = currentmax;
            int oldMin = currentmin;

            currentmax = Math.max(num,
                    Math.max(oldMax * num, oldMin * num));

            currentmin = Math.min(num,
                    Math.min(oldMax * num, oldMin * num));

            maxproduct = Math.max(maxproduct, currentmax);
        }

        return maxproduct;
    }
}