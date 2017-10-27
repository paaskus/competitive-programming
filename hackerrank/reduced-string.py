import sys

def solve(s):
    i = 0
    while i+1 < len(s):
        if (s[i] == s[i+1]):
            s = s[:i] + s[i+2:]
            i = 0; continue
        i += 1
    if len(s) == 0: return "Empty String"
    return s

s = input().strip()
print(solve(s))
