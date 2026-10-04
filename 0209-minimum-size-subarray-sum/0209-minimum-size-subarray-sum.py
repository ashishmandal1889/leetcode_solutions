class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        low = 0
        high = 0
        min_len = float("inf")
        total_sum = 0
        for high in  range(len(nums)):
            total_sum += nums[high]
            while total_sum>=target:
                current_len = high-low+1
                min_len = min(min_len,current_len)
                total_sum -= nums[low]
                low += 1
        return 0 if min_len == float("inf") else min_len
        