class Solution {
    public int findKthNumber(int m, int n, int k) {
        long low = 1;
        long high = (long) m * n;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = countLessOrEqual(m, n, mid);

            if (count >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    private long countLessOrEqual(int m, int n, long x) {
        long count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min((long) n, x / i);
        }
        return count;
    }
}