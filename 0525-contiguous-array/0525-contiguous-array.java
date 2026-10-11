class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int n = nums.length;

        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            int diff = zero - one;
            if(map.containsKey(diff)){
                ans = Math.max(ans,i-map.get(diff));
            }else{
                map.put(diff,i);
            }
            
        }
        return ans;
        
    
    }
}
