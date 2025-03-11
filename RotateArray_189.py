class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n

        self.reverse(nums, 0, n - 1)
        self.reverse(nums, 0, k - 1)
        self.reverse(nums, k, n - 1)

        # k = k % len(nums)
        # nums[:] = nums[-k:] + nums[:-k]


    def reverse(self, nums, start, end):
        while start < end :
            temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start += 1
            end -= 1

if __name__ == '__main__':
    slo = Solution()
    nums = [7,1,2,3,4,5,6]
    slo.rotate(nums,3)
    print(nums)