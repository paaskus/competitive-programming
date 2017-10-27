s = input().strip()
n = int(input().strip())

def solve(s, n):
    return (n // len(s)) * s.count('a') + s[:n % len(s)].count('a')

print(solve(s, n))
