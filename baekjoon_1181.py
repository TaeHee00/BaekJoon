import sys

N = int(sys.stdin.readline())
arr = []
for i in range(N):
    arr.append(sys.stdin.readline().strip())

arr = list(set(arr))
arr.sort()
# 알파벳 순으로 정렬
arr.sort(key=len)
# 길이순으로 재정렬

for i in arr:
    print(i)