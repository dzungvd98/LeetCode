class Solution :
    def twoSum(self, numbers, target):
        n = len(numbers)
        j = n - 1
        for i in range(n) :
            sum = numbers[i] + numbers[j]
            while sum > target:
                j -= 1
                sum = numbers[i] + numbers[j]
            if sum  == target :
                return [i + 1, j + 1]


if __name__ == '__main__':
    solu = Solution()
    numbers = [5, 25, 75]
    target = 100
    print(solu.twoSum(numbers, target))