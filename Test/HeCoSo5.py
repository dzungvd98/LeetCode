def kiemTraHeSo5(str) :
    length = len(str)

    sum = 0

    for i in range(length) :
        if '0' <= str[i] <= '4':
            digit = int(str[i])
            if digit > 4:
                return "NO"

            else :
                sum += digit
        else:
            return "NO"

    if sum == 5:
        return "YES"
    else :
        return  "NO"

if __name__ == '__main__':
    n = int(input())

    while n > 0 :
        str = input()
        print(kiemTraHeSo5(str))
        n -= 1