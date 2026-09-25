class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int sum = 0;
        int minlength = Integer.MAX_VALUE;
        int n = nums.length;
        for(int high = 0;high<n;high++){
            sum += nums[high];
            while(sum>=target){
                sum -= nums[low];
                
                int currentlength = high-low+1;
                minlength = Math.min(minlength,currentlength);
                low++;
            }
            
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
        
    }
}