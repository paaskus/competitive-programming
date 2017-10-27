# Python 2 implementation
while True:
    n, m = [int(x) for x in raw_input().strip().split()]
    if n == 0 and m == 0: break # end of input
    cds1 = [0] * n
    for i in xrange(n):
        cds1[i] = int(raw_input())
    i = 0
    count = 0
    for _ in xrange(m):
        cd2 = int(raw_input())
        while i < n and cds1[i] < cd2: i += 1 # ignore
        if i < n and cds1[i] == cd2: count += 1
    print count
