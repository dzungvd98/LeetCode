class Solution {
    public static int removeDuplicates(int[] nums) {
        int countNumber = 0;
        int savedNumber = nums[0];
        int k = 0;
        for(int i = 1; i < nums.length;i++) {
            if(nums[i] == savedNumber) {
                countNumber++;
            } else {
                countNumber = 0;
                savedNumber = nums[i];
            }
            
            if(countNumber < 2) {
                nums[++k] = nums[i];
            }
        }
        return k + 1;
        
//        int curr = 2;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != nums[curr-2]) {
//                nums[curr++] = nums[i];
//            }
//        }
//        return curr;
    }
    
    public static void main(String args[]) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
        
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }
    }
}