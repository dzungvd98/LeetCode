def tichlechiatongchan(num):
    strNum = str(num)
    tichle = 1.0
    tongchan = 0
    for i in range(len(strNum)):
        digit = int(strNum[i])
        if i % 2 == 0:
            tichle *= digit
        else:
            tongchan += digit
    if tongchan == 0:
        return "INVALID"
    print(tichle)
    print(tongchan)
    return f"{tichle/tongchan:.6f}"

if __name__ == '__main__':
    n = int(input())
    while n > 0:
        num = int(input())
        print(tichlechiatongchan(num))
        n -= 1