n = int(input().strip())

def solve(A):
    d = {} # dictionary (hash map, hash table); O(1) average time insert and search, O(n) space
    min_distance = len(A)+1 # any actual min_distance will at least be len(A) = n
    for i in range(n): # iterate through the list A of n elements
        if d.get(A[i]) == None: # number does not exist in dictionary
            d[A[i]] = i; continue # set to max possible distance (i.e. len(A))
        min_distance = min(abs(d[A[i]] - i), min_distance) # update min_distance
        d[A[i]] = i # overwrite previous index with current
    return min_distance if min_distance <= len(A) else -1 # return -1 if no min_distance is found

A = [int(x) for x in input().strip().split()]
print(solve(A))
