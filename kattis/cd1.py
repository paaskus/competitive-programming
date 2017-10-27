# Python 3 implementation
while True:
    n, m = [int(x) for x in input().strip().split()]
    if n == 0 and m == 0: break # end of input
    cds1 = [0] * n
    for i in range(n):
        cds1[i] = int(input())
    i = 0
    count = 0
    for _ in range(m):
        cd2 = int(input())
        while i < n and cds1[i] < cd2: i += 1 # ignore
        if i < n and cds1[i] == cd2: count += 1
    print(count)
