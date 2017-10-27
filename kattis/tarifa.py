#!/usr/bin/python3

import sys

X = int(input().strip())
N = int(input().strip())

available = X * (N + 1)
for i in range(N):
    p = int(input().strip())
    available -= p
print(available)
