import sys

T = int(sys.stdin.readline())
t_arr = []
arr = []

for i in range(T):
    weight, height = map(int, sys.stdin.readline().split())
    arr.append((weight, height))

for i in range(len(arr)):
    cnt = 1
    for j in range(0, len(arr)):
        if arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            cnt += 1
    t_arr.append(cnt)

for i in t_arr:
    print(i, end=" ")