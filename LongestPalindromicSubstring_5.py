def expandAroundCenter(s, left, right):
    while left >= 0 and right < len(s) and s[left] == s[right]:
        left -= 1
        right += 1
    return s[left + 1:right]


def longestPalindrome(s):
    longest = ""
    for i in range(len(s)):
        odd = expandAroundCenter(s, i, i)
        even = expandAroundCenter(s, i, i + 1)
        if len(odd) > len(longest):
            longest = odd
        if len(even) > len(longest):
            longest = even
    return longest

if __name__ == '__main__':
    s = "babad"
    print(longestPalindrome(s))