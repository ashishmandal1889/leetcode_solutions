class Solution:
    def longestOnes(self, nums: list[int], k: int) -> int:
        left = 0
        zeros = 0
        maxlength = 0
        
        for right in range(len(nums)):
            if nums[right] == 0:
                zeros += 1
            
            # Shrink window when zero count exceeds k
            while zeros > k:
                if nums[left] == 0:
                    zeros -= 1
                left += 1
            
            maxlength = max(maxlength, right - left + 1)
            
        return maxlength