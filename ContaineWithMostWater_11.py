class Solution():
    def maxArea(self, height):
        left = 0
        right = len(height) - 1
        maxVal = 0
        while left < right :
            minHeight = min(height[left], height[right])
            area = minHeight * (right - left)
            maxVal = max(maxVal, area)
            while left < right and height[left] <= minHeight :
                left += 1
            while left < right and height[right] <= minHeight :
                right -= 1
        return maxVal



if __name__ == '__main__':
    height = [1,8,6,2,5,4,8,3,7]
    solu = Solution()
    print(solu.maxArea(height))