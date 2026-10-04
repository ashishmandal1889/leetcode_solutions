class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(true){
            fast = nums[fast];
            fast = nums[fast];
            slow = nums[slow];
            if(slow == fast){
                slow = 0;
                while(slow != fast){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
       
     
        
    }
}