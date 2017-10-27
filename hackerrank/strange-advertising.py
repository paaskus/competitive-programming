import sys, math

n = int(input().strip())

def solve(n):
    likes = 5//2
    current = likes
    for i in range(n-1):
        current = current * 3 // 2
        likes += current
    return likes

print(solve(n))
