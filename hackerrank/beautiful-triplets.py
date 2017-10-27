def solve(A, d):
    count = 0
    for j in range(len(A)):
        potential1, potential2 = 0, 0
        for k in range(j+1, min(j+1+d, len(A))):
            if A[k] - A[j] == d: potential1 += 1
            if A[k] - A[j] > d: break
        for i in range(j-1, max(j-1-d, -1), -1):
            if A[j] - A[i] == d: potential2 += 1
            if A[j] - A[i] > d: break
        count += potential1 * potential2
    return count

n, d = map(int, input().strip().split())
A = [int(x) for x in input().strip().split()]

print(solve(A, d))
