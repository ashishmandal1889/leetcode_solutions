class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        low = 0
        maxlength = 0
        char_map = {}
        for high in range(len(s)):
            char_map[s[high]] = char_map.get(s[high],0)+1
            k = high-low+1
            while len(char_map)<(high-low+1):
                char_map[s[low]] -=1
                if char_map[s[low]]==0:
                    del char_map[s[low]]
                low +=1    
            maxlength = max(maxlength,high-low+1)
        return maxlength    

        