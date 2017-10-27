n = int(input().strip())

def solve(A): # greedy approach, O(n) time
    count = 0 # count the minumum number of loafes needed
    for i in range(n-1): # iterate from 0 to n-2
        if A[i] % 2 == 1: # check if A[i] (i'th element) is even
            count += 2 # to make A[i] even, we need a bread loaf; we also give a loaf to A[i+1]
            A[i+1] += 1 # keep track of the loaf given to A[i+1] (i.e. increment by 1)
    # if last element in A is odd now, the problem is impossible to solve
    if A[-1] % 2 == 1: return "NO"
    return count

A = [int(x) for x in input().strip().split()]
print(solve(A))
