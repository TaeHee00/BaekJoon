import sys

N = int(sys.stdin.readline())
arr = []
for i in range(N):
    u = int(sys.stdin.readline())
    arr.append(u)
arr.sort()
for i in arr:
    print(i)
