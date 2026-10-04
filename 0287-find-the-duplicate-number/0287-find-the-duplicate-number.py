class Solution:
    def findDuplicate(self, nums: list[int]) -> int:
        slow = 0
        fast = 0
        while True:
            fast = nums[fast]
            fast = nums[fast]
            slow = nums[slow]
            if slow == fast:
                slow = 0
                while slow != fast:
                    slow = nums[slow]
                    fast = nums[fast]
                return slow;    
        