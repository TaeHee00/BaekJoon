import sys

n = int(sys.stdin.readline())

s = list(map(int, sys.stdin.readline().strip().split()))

total = 0
for i in range(n):
    cnt = 0
    if s[i] == 1:
        continue
    for j in range(1, s[i]):
        if s[i] % j == 0:
            cnt += 1
    if cnt == 1:
        total += 1

print(total)
