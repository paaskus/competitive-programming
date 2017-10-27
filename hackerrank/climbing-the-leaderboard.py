import sys

n = int(input().strip())
existing_scores = [int(score) for score in input().strip().split()]
m = int(input().strip())
level_scores = [int(score) for score in input().strip().split()]

def solve(old_scores, new_scores):
    unique = [] # unique values; used as a stack
    for i in range(n): # find unique scores
        if (len(unique) == 0 or unique[-1] != old_scores[i]): unique.append(old_scores[i])
    for i in range(m): # calculate rank after each level
        while unique and new_scores[i] >= unique[-1]: unique.pop() # while 'unique' is non-empty and ...
        print(len(unique)+1) # print current rank
solve(existing_scores, level_scores)
