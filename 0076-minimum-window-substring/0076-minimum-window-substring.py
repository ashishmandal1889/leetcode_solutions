class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) == 0 or len(t) == 0 or len(s) < len(t):
            return ""

        count = [0] * 256
        for c in t:
            count[ord(c)] += 1

        low = 0
        start_idx = -1
        min_len = float("inf")
        required = len(t)

        for high in range(len(s)):
            right = s[high]

            
            if count[ord(right)] > 0:
                required -= 1

           
            count[ord(right)] -= 1

            
            while required == 0:
                current_len = high - low + 1

                if current_len < min_len:
                    min_len = current_len
                    start_idx = low

                left = s[low]
                count[ord(left)] += 1

                if count[ord(left)] > 0:
                    required += 1

                low += 1  # Increment low pointer

        return "" if start_idx == -1 else s[start_idx : start_idx + min_len]