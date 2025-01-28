class Solution {
    public static void rotate(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        boolean[] check = new boolean[10000];
        int savedNumber = nums[0],x;
        while(i < n) {
            if(i < k) {
                x = nums[k + i];
                nums[k + i] = savedNumber;
                check[k + i] = true;
                savedNumber = x;
                i = k + i;
            } else {
                x = nums[i-k-1];
                nums[i - k - 1] = savedNumber;
                check[n - i - 1] = true;
                savedNumber = x;
                i = i - k - 1;
            }
            
            if(check[i] == true) i++;
        }
    }
    
    public static void main(String args[]) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);

    }
}