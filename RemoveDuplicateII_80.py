class Solution(object):
    def removeDuplicates(self, nums):
        # k = 0
        # compareValue = -99999
        # count = 0
        # for num in nums :
        #     if num == compareValue :
        #         count += 1
        #         if count > 2:
        #             continue
        #     elif num != compareValue :
        #         count = 1
        #         compareValue = num
        #     nums[k] = num
        #     k += 1

        if len(nums) <= 2:
            return len(nums)

        k = 2
        for i in range(2, len(nums)) :
            if nums[i] != nums[k-2] :
                nums[k] = nums[i]
                k += 1
        return k


if __name__ == '__main__':
    nums = [0,0,1,1,1,1,2,3,3]
    solu = Solution()
    print(solu.removeDuplicates(nums))