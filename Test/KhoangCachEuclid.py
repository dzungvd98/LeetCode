def euclid_space(X, Y) :
    result = 0.0
    result2 = 0
    for i in range(len(X)) :
        result += (X[i] - Y[i])**2
        result2 += X[i]*Y[i]

    distance = result**0.5

    print (f"{distance:.2f} {result2}")


if __name__ == '__main__':
    n = int(input())
    while n > 0:
        X = list(map(int, input().split()))
        Y = list(map(int, input().split()))

        euclid_space(X, Y)
        n -= 1