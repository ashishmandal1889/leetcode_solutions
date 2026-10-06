class Solution:
    def maximumSum(self, arr: list[int]) -> int:
        nodelete = arr[0]
        onedelete = 0
        max_sum = arr[0]
        for i in range(1,len(arr)):
            onedelete = max(onedelete + arr[i],nodelete)
            nodelete = max(nodelete + arr[i],arr[i])
            max_sum = max(max_sum, max(onedelete,nodelete))
        return max_sum    