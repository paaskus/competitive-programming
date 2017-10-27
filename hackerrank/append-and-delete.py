import sys

s, t, k = input().strip(), input().strip(), int(input().strip())

def solve(s, t, k):
    prefix_length = 0
    for i in range(min(len(s), len(t))):
        if s[0] == t[0]:
            s = s[1:]; t = t[1:] # remove common prefix from both strings
            prefix_length += 1
        else: break
    if len(s) + len(t) > k: return "No" # case 1
    if (k - len(s) - len(t)) % 2 == 0: return "Yes" # case 2
    if len(s) + len(t) + 2*prefix_length < k: return "Yes" # case 3
    return "No" # case 4

print(solve(s, t, k))
