import sys

def solve(n, m, s):
    """
    n -- number of prisoners
    m -- number of sweets
    s -- the prisoner ID
    """
    id_of_poisoned_prisoner = (s - 1 + m - 1) % n + 1
    return id_of_poisoned_prisoner

testcases = int(input().strip())

for i in range(testcases):
    n, m, s = [int(x) for x in input().strip().split()]
    print(solve(n, m, s))
