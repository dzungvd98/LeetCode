class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        length = len (nums)
        maxStep = nums[0]
        for i in range(1, length) :
            maxStep -= 1
            if maxStep < nums[i] and maxStep >= 0 :
                maxStep = nums[i]
            if maxStep < 0 :
                return False
        return True


if __name__ == '__main__':
    nums = [1,2,3]
    solu = Solution()
    print(solu.canJump(nums))
