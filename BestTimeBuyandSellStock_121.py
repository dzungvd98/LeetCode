class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buyPrice = prices[0]
        maxProfit = 0
        for price in prices :
            if price < buyPrice :
                buyPrice = price
            if maxProfit > price - buyPrice :
                maxProfit = price - buyPrice

        return maxProfit

if __name__ == '__main__':
    solu = Solution()
    nums = [7,6,4,3,1]
    print(solu.maxProfit(nums))