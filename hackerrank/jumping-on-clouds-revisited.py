import sys

n, k = [int(x) for x in input().strip().split()]
clouds = [int(x) for x in input().strip().split()]

def solve(clouds, k):
    energy = 100
    current_cloud = 0
    done = False
    while not done:
        current_cloud = (current_cloud + k) % n
        energy -= 1 if clouds[current_cloud] == 0 else 3
        if current_cloud == 0: done = True
    return energy

print(solve(clouds, k))
