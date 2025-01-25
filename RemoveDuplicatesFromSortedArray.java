class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int checkedNumber = nums[0];
        int k = 1;
        for(int i = 1; i < nums.length; i++) {
          if(nums[i] != checkedNumber) {
              nums[k++] = nums[i];
              checkedNumber = nums[i];
          } 
        }
        return k;
        
        /*
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
          if(nums[i] != nums[k]) {
              nums[++k] = nums[i];
          } 
        }
        return k + 1;
        */
    }
    
    public static void main(String args[]) {
        int[] nums = {};
        System.out.println(removeDuplicates(nums));
    }
}