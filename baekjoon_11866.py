import sys

n, k = map(int, sys.stdin.readline().split())
arr = []
for i in range(n):
    arr.append(i + 1)
aarr = []

index = k - 1
while arr:
    aarr.append(arr.pop(index))
    if arr:
        index = ((index - 1) + k) % len(arr)
    # if len(aarr) == n:
    #     break
    # aarr.append(arr[index])
    # arr.remove(arr[index])
    #
    # if (index + 3) > len(arr):
    #     index -= len(arr)
    #     if (index + 3) > len(arr):
    #         index -= len(arr)
    # index += 3
    # index -= 1

print("<", end="")
for i in aarr:
    if i == aarr[-1]:
        print(i, end=">")
    else:
        print(i, end=", ")