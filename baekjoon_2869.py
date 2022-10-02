import sys
import math

A, B, V = map(int, sys.stdin.readline().split())
location = 0
cnt = 0

C = (V - B) / (A - B)
print(int(math.ceil(C)))
