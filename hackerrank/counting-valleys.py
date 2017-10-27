import sys

def solve(steps):
    level = 0 # 0 is sea level; negative levels are below sea level; positive levels are above sea level
    valleys = 0
    for i in range(len(steps)):
        if (steps[i] == 'U'):
            level += 1
            if level == 0: valleys += 1 # end of valley
        elif (steps[i] == 'D'): level -= 1
    return valleys        

n = int(input().strip())
steps = input().strip()

print(solve(steps))
