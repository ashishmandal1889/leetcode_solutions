class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Base case: prefix sum of 0 has occurred once
        map.put(0, 1);
        
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            
            // If (sum - k) exists in the map, add its frequency to the count
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // Record current prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}