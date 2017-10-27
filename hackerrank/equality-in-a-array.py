n = int(input().strip())
A = [int(x) for x in input().strip().split()]

def solve(A):
    buckets = [0] * 100
    for i in range(n): buckets[A[i]-1] += 1
    return n - max(buckets)

print(solve(A))
