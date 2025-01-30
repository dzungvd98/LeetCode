class Solution {
    public static int maxProfit(int[] prices) {
        int i = 0;
        int j = prices.length - 1;
        int max = prices[j] - prices[i];
        while(i < j && i < prices.length && j >= 0) {
            if(prices[j - 1] - prices[i] >= max) {
                j--;
                
                max = prices[j] - prices[i];
            } else if(prices[j] - prices[i+1] >= max) {
                i++;
                max = prices[j] - prices[i];
            }
            else {
                i++;
                j--;
            }
            System.out.println(j);
            
        }
        return max;
    }
    
    public static void main(String args[]) {
        int[] nums = {2,1,2,0,1};
        System.out.println(maxProfit(nums));
    }
}