class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buyPrice = prices[0]
        size = len(prices)
        profit = 0
        for i in range (0,size - 1) :
            if prices[i] > prices[i + 1] :
                profit += prices[i] - buyPrice
                buyPrice = prices[i + 1]
        profit += prices[size - 1] - buyPrice
        return profit

if __name__ == '__main__':
    prices = [7,1,5,3,6,4]
    solu = Solution()
    print(solu.maxProfit(prices))