def kiemTraHeSo5(str) :
    totalSum = 0
    for char in str:
        if '0' <= char <= '4':
            totalSum += int(char)
        else:
            return "NO"

    if totalSum == 5:
        return "YES"

    return "NO"


if __name__ == '__main__':
    n = int(input())

    while n > 0 :
        str = input()
        print(kiemTraHeSo5(str))
        n -= 1