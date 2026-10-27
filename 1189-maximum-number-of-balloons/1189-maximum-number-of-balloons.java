class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        
       
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }
        
       
        int b = have.getOrDefault('b', 0);
        int a = have.getOrDefault('a', 0);
        int l = have.getOrDefault('l', 0) / 2;
        int o = have.getOrDefault('o', 0) / 2; 
        int n = have.getOrDefault('n', 0);
        
        int min1 = Math.min(b, a);
        int min2 = Math.min(l, o);
        int min3 = Math.min(min2, n);
        
        return Math.min(min1, min3);
    }
}