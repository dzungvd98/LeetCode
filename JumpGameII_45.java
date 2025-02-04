class Solution {
    public static int jump(int[] nums) {
//        int step = 0;
//        int i = 0;
//        int count = 0;
//        while(step < nums.length - 1) {
//            int maxStep = step;
//            while(i <= step) {
//                if(maxStep < nums[i] + i) {
//                    maxStep = nums[i] + i;
//                }
//                i++;
//            }
//            if(maxStep == step) return -1;
//            step = maxStep;
//            count++;
//        }
//        return count;

          if(nums.length <= 1) return 0;
          
          int count = 0, curEnd = 0, nextEnd = 0;
          for(int i = 0; i < nums.length - 1; i++) {
              nextEnd = Math.max(nextEnd, i + nums[i]);
              if(i == curEnd) {
                  count++;
                  curEnd = nextEnd;
                  if(curEnd >= nums.length - 1) return count;
              }
          }
          return count;
    }
    
    public static void main(String args[]) {
        int[] nums = {1,2};
        System.out.println(jump(nums));
    }
}