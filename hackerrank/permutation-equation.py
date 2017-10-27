import sys

n = int(input().strip())
permutation = [int(x)-1 for x in input().strip().split()]

def solve(permutation):
    d = [0]*n
    for i in range(n):
        d[permutation[permutation[i]]] = i + 1
    for i in range(n):
        print(d[i])
solve(permutation)
