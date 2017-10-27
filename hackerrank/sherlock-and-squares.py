import sys, math

def solve(a, b):
    sqrt_a, sqrt_b = math.ceil(math.sqrt(a)), math.floor(math.sqrt(b))
    # count the integers between x = ceil(sqrt(a)) and y = floor(sqrt(b)), ie. y - x + 1
    return sqrt_b - sqrt_a + 1

testcases = int(input().strip())
for _ in range(testcases):
    a, b = [int(x) for x in input().strip().split()]
    print(solve(a, b))

"""
square integers:
1^2 = 1
--- diff = 3
2^2 = 4
--- diff = 5
3^2 = 9
--- diff = 7
4^2 = 16
--- diff = 9
5^2 = 25
"""
