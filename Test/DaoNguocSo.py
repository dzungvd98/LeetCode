def kiem_tra_dao_nguoc(num):
    strNum = str(num)
    doDai = len(strNum)
    if strNum[0] == strNum[doDai - 1] and strNum[1] == strNum[doDai - 2]:
        return "YES"

    return "NO"

def check():
    n = int(input())
    while n > 0 :
        num = int(input())
        print(kiem_tra_dao_nguoc(num))
        n -= 1


if __name__ == '__main__':
    check()