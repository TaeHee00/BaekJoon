import sys

T = int(sys.stdin.readline())
arr = []

for i in range(T):
    x, y = map(int, sys.stdin.readline().split())
    arr.append((x, y))

arr.sort()
# key = lambda x: x[0]

for i in arr:
    print(i[0], i[1])