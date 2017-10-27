testcases = int(input().strip())

def solve(n, a, b):
    if a == b: print((n-1) * a); return
    least = min(a, b); greatest = max(a, b)
    for i in range(n):
        end = ' ' if i < n-1 else '\n'
        print(i * greatest + (n-i-1) * least, end=end)

for _ in range(testcases):
    n = int(input().strip())
    a = int(input().strip())
    b = int(input().strip())
    solve(n, a, b)
