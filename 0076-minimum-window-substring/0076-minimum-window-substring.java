class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++; // Count required characters
        }

        int required = t.length();
        int low = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = -1;

        for (int high = 0; high < s.length(); high++) {
            char right = s.charAt(high);

            // If this character is needed, decrease required count
            if (count[right] > 0) {
                required--;
            }
            count[right]--; // Mark character as used

            // When all characters are matched, shrink window from left
            while (required == 0) {
                int currentLen = high - low + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    startIdx = low;
                }

                char left = s.charAt(low);
                count[left]++; // Put back character frequency
                
                // If we restored a required character, increment required count
                if (count[left] > 0) {
                    required++;
                }

                low++; // Move left pointer forward
            }
        }

        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
    }
}