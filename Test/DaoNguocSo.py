def kiem_tra_dao_nguoc(num):
    strNum = str(num)
    length = len(strNum)
    if strNum[0] == strNum[length - 1] and strNum[1] == strNum[length-2]:
        return "YES"

    return "NO"

def check():
    n = int(input())
    arr = [int(input()) for _ in range(n)]

    for i in range(len(arr)) :
        print(kiem_tra_dao_nguoc(arr[i]))

if __name__ == '__main__':
    check()