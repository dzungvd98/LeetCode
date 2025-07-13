def threeSum(nums):
    nums.sort()
    res = []
    n = len(nums)

    for i in range(n - 2):
        if nums[i] > 0:
            break
        if i != 0 and nums[i] == nums[i - 1]:
            continue
        sol(i + 1, -nums[i], nums, res)

    return res


def sol(start, target, nums, res):
    end = len(nums) - 1

    while start < end:
        total = nums[start] + nums[end]
        if total > target:
            end -= 1
        elif total < target:
            start += 1
        else:
            res.append([-target, nums[start], nums[end]])
            start += 1
            end -= 1
            while start <= end and nums[start] == nums[start - 1]:
                start += 1

if __name__ == '__main__':
    nums = [-1,0,1,2,-1,-4]
    print(threeSum(nums))