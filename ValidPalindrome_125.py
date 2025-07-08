class Solution:
    def isPalindrome(self, s):
        l = 0
        r = len(s) - 1

        while l < r:
            while l < r and not s[l].isalnum():
                l += 1
            while r > l and not s[r].isalnum():
                r -= 1

            if l > r or s[l].lower() != s[r].lower():
                return False
            else:
                l+=1
                r-=1
        return True

if __name__ == '__main__':
    solu = Solution()
    s = "A man, a plan, a canal: Panama"
    print(solu.isPalindrome(s))