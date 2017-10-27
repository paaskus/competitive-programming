def solve(b, w, x, y, z):
    return b * min(x, y+z) + w * min(y, x+z)

T = int(input().strip())
for i in range(T):
    b, w = [int(x) for x in input().strip().split()]
    x, y, z = [int(x) for x in input().strip().split()]
    print(solve(b, w, x, y, z))
