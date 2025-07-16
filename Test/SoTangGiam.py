def kiemTraSoGiamTang(num):
    strNum = str(num)
    doDai = len(strNum)

    tang = 0
    giam = 1
    prev = strNum[0]
    if doDai != 8 :
        return "NO"

    for i in range(1, doDai):
        if strNum[i] > prev:
            tang += 1
        elif strNum[i] < prev:
            giam += 1
        else:
            return "NO"

    if giam == 8 or giam == 1:
        return "NO"

    if tang + giam == 8:
        return "YES"

    return "NO"

def ver2(num):
    strNum = str(num)
    if len(strNum) != 8:
        return "NO"

    i = 1
    while i < 8 and strNum[i] < strNum[i - 1] :
            i += 1

    if i == 1 or i == 8:
        return "NO"

    while i < 8 and strNum[i] > strNum[i - 1]:
        i += 1

    if i == 8:
        return "YES"
    return "NO"

if __name__ == '__main__':
    n = int(input())
    while n > 0:
        num = int(input())
        print(ver2(num))
        n -= 1