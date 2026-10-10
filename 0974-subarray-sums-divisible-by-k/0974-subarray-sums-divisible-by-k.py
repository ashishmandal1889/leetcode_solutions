class Solution:
    def subarraysDivByK(self, nums: list[int], k: int) -> int:
        ans = 0
        current_sum = 0
        
        freq_map = defaultdict(int)
        freq_map[0] = 1 
        for i in range(len(nums)):
            current_sum += nums[i]
            rem = current_sum%k
            if rem <0:
                rem= rem + k
            ans += freq_map[rem]
            freq_map[rem] += 1
        return ans        
