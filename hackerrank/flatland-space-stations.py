import math

n, m = map(int, input().strip().split())

def solve(A):
    if n == m: return 0
    A.sort()
    A.insert(0, -A[0]); A.append(2*n - 2 - A[-1]) # turn special cases into normal cases
    max_dist = 0
    for i in range(len(A)-1):
        dist = A[i+1] - A[i]
        max_dist = max(math.floor(dist / 2), max_dist)
    return max_dist

def solve2(A): # alternative version
    if n == m: return 0
    A.sort()
    max_dist = max(A[0], (n-1) - A[-1])
    if m == 1: return max_dist
    for i in range(m-1):
        dist = A[i+1] - A[i]
        max_dist = max(math.floor(dist / 2), max_dist)
    return max_dist

A = [int(x) for x in input().strip().split()]

print(solve(A))
