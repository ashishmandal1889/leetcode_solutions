import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int maxlength = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char rightChar = s.charAt(high);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // If map.size() < window size, a duplicate character exists inside the window
            while (map.size() < high - low + 1) {
                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                low++; // Move left boundary forward
            }

            // Update maximum valid window size
            maxlength = Math.max(maxlength, high - low + 1);
        }

        return maxlength;
    }
}