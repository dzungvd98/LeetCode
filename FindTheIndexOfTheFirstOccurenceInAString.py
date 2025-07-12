def strStr(haystack, needle):
    i = 0
    while i < len(haystack):
        j = 0
        saved = i
        while   j < len(needle) and i < len(haystack) and haystack[i] == needle[j]:
            i += 1
            j += 1

        if j == len(needle) :
            return saved
        i = saved + 1
    return -1

def str2(haystack, needle):
    lenhay = len(haystack)
    lenneed = len(needle)
    for i in range(lenhay - lenneed + 1) :
        if haystack[i: i+ lenneed] == needle :
            return i
    return -1

if __name__ == '__main__':
    haystack = "leetcode"
    needle = "leeto"
    print(str2(haystack, needle))
