class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        left = 0
        sum = 0
        minlength = float("inf")

        for right in range(len(nums)):
            sum += nums[right]

            while sum >= target:
                currentlength = right - left + 1
                minlength = min(minlength, currentlength)
                sum -= nums[left]
                left += 1

        
        return 0 if minlength == float('inf') else minlength