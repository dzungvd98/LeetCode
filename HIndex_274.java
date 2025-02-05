import java.util.Arrays;
        
class Solution {
    public static int hIndex(int[] citations) {
//        Arrays.sort(citations);
//        int n = citations.length;
//        for(int i = 0; i < citations.length; i++) {
//            int h = n-i;
//            if(citations[i] >= h) return h;
//        }
//        return 0;

          int n = citations.length;
          int[] count = new int[n+1];
          for(int c : citations) {
              if(c >= n) count[n]++;
              else count[c]++;
          }
          
          int total = 0;
          for(int h = n; h >= 0; h--) {
              total += count[h];
              if(total >= h) return h;
          }
          return 0;
    }
    
    public static void main(String args[]) {
        int[] nums = {1,3,1};
        System.out.println(hIndex(nums));
    }
}