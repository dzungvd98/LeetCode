class Solution {
    public static boolean canJump(int[] nums) {
        int step = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(--step < nums[i]) {
                step = nums[i];
            }
            if(step <= 0 && i != nums[n - 1]) return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        int[] nums = {0,1};
        System.out.println(canJump(nums));
    }
}