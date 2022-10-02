T = int(input())

for i in range(T):
    k = int(input())
    n = int(input())
    apt = []

    for j in range(k + 1):
        temp_arr = []
        if j == 0:
            for c in range(n):
                temp_arr.append(c + 1)
        else:
            temp = 0
            for c in range(n):
                temp += apt[j - 1][c]
                temp_arr.append(temp)

        apt.append(temp_arr)

    print(apt[k][n - 1])
