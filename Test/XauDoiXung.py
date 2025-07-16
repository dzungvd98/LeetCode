def kiem_tra_doi_xung(s):
    doDai = len(s)
    if doDai % 2 == 0:
        return "NO"
    j = doDai - 1
    for i in range(doDai) :
        if s[i] >= '0' and s[i]  <= '9':
            return "NO"
        if s[i].lower() == s[j].lower():
            j -= 1
    return "YES"

if __name__ == '__main__':
    n = int(input())
    while n > 0:
        s = input()
        print(kiem_tra_doi_xung(s))
        n -= 1



