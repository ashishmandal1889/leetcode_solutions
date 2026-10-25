class Solution:
    def firstUniqChar(self, s: str) -> int:
        # Step 1: Count the frequency of each character
        freq = {}
        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1
            
        # Step 2: Find the first character with a frequency of 1
        for i in range(len(s)):
            if freq[s[i]] == 1:
                return i
                
        return -1