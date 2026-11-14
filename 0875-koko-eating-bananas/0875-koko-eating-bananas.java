class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // Find the maximum pile size to set our high boundary
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int minSpeed = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canFinish(piles, h, mid)) {
                minSpeed = mid; // Try to find a slower valid speed
                high = mid - 1;
            } else {
                low = mid + 1; // Too slow, need a higher speed
            }
        }
        
        return minSpeed;
    }
    
    // Helper method to check if Koko can eat all bananas within h hours at speed k
    private boolean canFinish(int[] piles, int h, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / k) without floating-point inaccuracy
            totalHours += (pile + k - 1) / k;
        }
        return totalHours <= h;
    }
}