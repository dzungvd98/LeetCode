class Solution {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int size = prices.length;
        int sumProfit = 0;
        for(int i = 0; i  < size - 1; i++) {
            if(prices[i] > prices[i+1]) {
                sumProfit += prices[i] - buy;
                buy = prices[i+1];
            }
        }
        sumProfit += prices[size - 1] - buy;
        return sumProfit;
    }
    
    public static void main(String args[]) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}