import sys

T = int(input())
num_arr = [0] * 10000

for i in range(T):
    a = int(sys.stdin.readline())
    num_arr[a - 1] += 1

for i in range(10000):
    if num_arr[i] != 0:
        for j in range(num_arr[i]):
            print(i + 1)
