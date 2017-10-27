import sys

n, m = [int(x) for x in input().strip().split()]
A = [int(x) for x in input().strip().split()]
B = [int(x) for x in input().strip().split()]

def solve(A, B):
    A_max = max(A) # x cannot be smaller than max(A)
    B_min = min(B) # x cannot be greater than min(B)
    count = 0
    for x in range(A_max, B_min+1):
        stop = False
        for i in range(n):
            if not x % A[i] == 0: stop = True; break
        if stop: continue
        for i in range(m):
            if not B[i] % x == 0: stop = True; break
        if stop: continue
        count += 1
    return count

print(solve(A, B))
