def tinhTienDien_1(soDien):
    if soDien <= 0:
        print("So dien nhap vao phai lon hon 0")
        return 0
    result = 0
    if soDien - 50 <= 0:
        result = soDien * 1728

    if 50 < soDien <= 100:
        result = 50*1728 + (soDien-50) * 1786
    if 100 <soDien <= 200:
        result = 50*1728 + 50 * 1786 + (soDien - 100) * 2074
    if 200 < soDien <= 300:
        result =  50*1728 + 50 * 1786  + 100*2074 + (soDien - 200) * 2612

    if 300 < soDien <= 400:
        result = 50*1728 + 50 * 1786  + 100*2074 + 100 * 2612 +  (soDien - 300) * 2919
    if soDien > 400:
        result = 50 * 1728 + 50 * 1786 + 100 * 2074 + 100 * 2612 + 100 * 2919+ (soDien - 400) * 3015

    return result


def atbash(s):
    s = s.upper()
    result = ""
    for char in s:
        if  65 <= ord(char) <= 90:
            newChar = chr(65 + (90- ord(char)))
            result += str(newChar)
        else:
            result += str(char)

    return result

def is_palindrome(s):
    i = 0
    j = len(s) - 1
    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1

    return True


def count_palindromes(str_input):
    sArr = str_input.split()
    result = 0
    for sz in sArr :
        if is_palindrome(sz):
            result += 1

    return result

def count_unique_palindromes(str_input):
    sArr = list(set(str_input.split()))
    result = 0
    for sz in sArr :
        if is_palindrome(sz):
            result += 1

    return result

class NhanVien:
    def __init__(self, ma, ten, vao, ra):
        self.ma = ma
        self.ten = ten
        self.vao = vao
        self.ra = ra



if __name__ == '__main__':
    print(atbash("Sinh vien PTIT D21"))
    print(tinhTienDien_1(70))
    print(is_palindrome("PTIT"))
    print(count_unique_palindromes("madam madam madam 121 my name"))