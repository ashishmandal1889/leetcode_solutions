class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int low = 0;
        int maxfruits = 0;

        for (int high = 0; high < fruits.length; high++) {
            // Add current fruit to frequency map
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            // Shrink window if we have more than 2 distinct fruit types
            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);
                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }
                low++;
            }

            // Record maximum window length found
            maxfruits = Math.max(maxfruits, high - low + 1);
        }

        return maxfruits;
    }
}