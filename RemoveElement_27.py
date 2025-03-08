
class Solution(object):
    def removeElement(self, nums, val):
        k = 0
        for vl in nums:
            if vl != val:
                nums[k] = vl
                k = k + 1
        return k
if __name__ == '__main__':
    solu = Solution()
    nums = [3,2,2,3]
    print(solu.removeElement(nums, 3))
