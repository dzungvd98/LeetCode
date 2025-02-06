class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int prefix = 1;
        int n = nums.length;
        int result[] = new int[n];
        for(int num : nums) {
            if(num != 0) prefix *= num;
            else countZero ++;
        }
        
        if(countZero > 1) return result;
        else if(countZero == 1) {
            for(int i = 0; i < n; i++) {
                if(nums[i] == 0) {
                    result[i] = prefix;
                    break;
                }
            }
        } 
        else {
            for(int i = 0; i < n; i++) {
                result[i] = prefix/nums[i];
            }
        }
        return result;
    }
    
    public static void main(String args[]) {
        int nums[] = {-1,1,0,-3,3};
        int[] result = productExceptSelf(nums);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}