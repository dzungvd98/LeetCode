class Solution {
    public static int removeElement(int[] nums, int val) {
        int l = 0;
        for(int r = 0; r < nums.length; r++) {
            if(nums[r] != val) {
                nums[l++] = nums[r];
            }
        }
        return l;
    }
    
    public static void main(String args[]) {
        int[] nums = {3,3,2};
        System.out.println(removeElement(nums,3));
    }
}