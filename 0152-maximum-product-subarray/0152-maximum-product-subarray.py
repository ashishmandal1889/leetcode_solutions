class Solution:
    def maxProduct(self, nums: list[int]) -> int:
        current_min = nums[0]
        current_max = nums[0]
        max_product = nums[0]
        for i in range(1,len(nums)):
            num = nums[i]
            old_min = current_min
            old_max = current_max
            current_min = min(num,old_min*num,old_max*num)
            current_max = max(num,old_max*num,old_min*num)
            max_product = max(max_product,max(current_min,current_max))
        return max_product