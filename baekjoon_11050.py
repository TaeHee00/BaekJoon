import math, sys

N, K = map(int, sys.stdin.readline().split())

result = math.factorial(N) / (math.factorial(N - K) * math.factorial(K))
print(int(result))