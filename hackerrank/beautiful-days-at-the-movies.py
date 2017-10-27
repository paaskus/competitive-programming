import sys

i, j, k = [int(num) for num in input().strip().split()]

def solve(i, j, k):
    count = 0
    for x in range(i, j+1):
        if abs(x-int(str(x)[::-1])) % k == 0: count += 1
    return count

print(solve(i, j, k))

"""
str(x)[::-1] reverses the string using extended slice notation;
see https://docs.python.org/2/whatsnew/2.3.html#extended-slices
"""
