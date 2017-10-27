n = int(input().strip())
clouds = [int(x) for x in input().strip().split()]

def solve(clouds):
    moves = 0
    current_cloud = 0
    while current_cloud < n-1:
        current_cloud += 2 if clouds[min(current_cloud + 2, n-1)] == 0 else 1
        moves += 1
    return moves

print(solve(clouds))
