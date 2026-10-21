class Solution:
    def nextGreaterElements(self, nums: list[int]) -> list[int]:
        n= len(nums)
        result = [-1]* n
        stack = []
        for i in range(2*n):
            current = nums[i%n]
            while stack and nums[stack[-1]]<current:
              result[stack.pop()] = current
        
            if i <n:
             stack.append(i)

        return result        