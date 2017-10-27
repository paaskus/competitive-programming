import sys

def solve(camel_case):
    words = 1
    for i in range(len(camel_case)):
        ith_order = ord(camel_case[i])
        if ith_order >= 65 and ith_order <= 90: words += 1
    return words

camel_case = input().strip()
print(solve(camel_case))
