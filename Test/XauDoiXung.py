def is_valid_palindrome(s):
    length = len(s)
    if length % 2 == 0 :
        return "NO"

    i = 0
    while i <= len(s)/2 :
        if(s[i] >= '0' and s[i] <= '9' ) or (s[length - 1 - i] >= '0' and s[length -1 -i] <= '9'):
            return "NO"
        if s[i].lower() == s[length - 1 - i].lower():
            i += 1
        else :
            return "NO"

    return "YES"



if __name__ == '__main__':
    n = int(input())
    while n > 0:
        str = input().strip()
        print(is_valid_palindrome(str))
        n -= 1

