def math_vector(X, Y) :
    eclude_space = 0.0
    d = 0
    for i in range(len(X)):
        eclude_space += (X[i] - Y[i])**2
        d += X[i] * Y[i]

    eclude_space = eclude_space**0.5

    print(f"{eclude_space:.2f} {d}")




if __name__ == '__main__':
    n = int(input())
    while n > 0:
        X = list(map(int, input().split()))
        Y = list(map(int, input().split()))
        math_vector(X, Y)
        n -= 1
