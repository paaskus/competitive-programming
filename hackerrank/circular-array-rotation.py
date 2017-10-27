import sys

n, k, q = [int(x) for x in input().strip().split()]

array = [int(x) for x in input().strip().split()]

def solve(array, k, query):
    """
    array -- list of n integers [a_0, a_1, ..., a_{n-1}]
    k -- number of right circular rotations where
         [a_0, a_1, ..., a_{n-1}] becomes [a_{n-1}, a_0, ..., a_{n-2}]
    query -- an index m in the k-times rotated array describing the integers to be returned
    """
    return array[(query - k) % n]

for i in range(q):
    query = int(input().strip())
    print(solve(array, k, query))

