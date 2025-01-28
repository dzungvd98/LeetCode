class Solution {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                result = nums[i];
            }
            
            if(result == nums[i]) count++;
            else count--;
        }
        return result;
    }
    
    public static void main(String args[]) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }
}