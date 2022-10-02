import sys

x, y = map(int, sys.stdin.readline().split())
arr = []
t_arr = []
for i in range(x):
    t_arr.append(list(sys.stdin.readline().strip()))
print(t_arr)
cnt = 0
for i in range(y):
    for j in range(x - 1):
        if t_arr[i][j] == "W" and t_arr[i][j + 1] == "B":
            continue
        elif t_arr[i][j] == "B" and t_arr[i][j + 1] == "W":
            continue
        else:
            cnt += 1
print(int(cnt/2))
