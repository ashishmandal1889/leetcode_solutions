from collections import deque
from typing import List

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        q = deque()  # stores indices of array elements
        result = []
        
        for i in range(len(nums)):
            # 1. Remove indices that are out of bounds for the current window
            if q and q[0] <= i - k:
                q.popleft()
                
            # 2. Maintain monotonic decreasing order in deque
            while q and nums[q[-1]] <= nums[i]:
                q.pop()
                
            # 3. Add current element's index
            q.append(i)
            
            # 4. Record maximum element once the window size reaches k
            if i >= k - 1:
                result.append(nums[q[0]])
                
        return result