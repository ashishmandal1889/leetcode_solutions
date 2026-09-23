class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = {}
        for i in range (len(nums)):
            num = nums[i]
            need=target-num
            if need in seen:
                return [seen[need],i]
            
            seen[num] = i
    
            