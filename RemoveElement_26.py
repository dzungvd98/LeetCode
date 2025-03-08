class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k = 1
        compareValue = nums[0]

        for i in range(1, len(nums)) :
            if nums[i] == compareValue :
                continue
            else :
                compareValue = nums[i]
                nums[k] = compareValue
                k = k + 1
        return k

if __name__ == '__main__':
    solu = Solution()
    nums = [3,2,2,3]
    print(solu.removeDuplicates(nums))