class Solution:
    def isSubsequence(self, s, t):
        n = len(s)
        i = 0
        for ch in t:
            if i < n and s[i] == ch:
                i += 1
        return i == n


if __name__ == '__main__':
    solu = Solution()
    s = "abc"
    t = "ahbgdc"
    print(solu.isSubsequence(s, t))