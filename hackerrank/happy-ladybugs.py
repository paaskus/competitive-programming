games = int(input().strip())

def solve(b):
    underscores = b.count('_')
    # handle special cases
    if len(b) == 1: print("YES" if underscores > 0 else "NO"); return
    if len(b) == 2: print("YES" if b[0] == b[1]    else "NO"); return
    if len(b) >= 3: # check if already happy
        happy = b[0] == b[1] and b[-1] == b[-2]
        for i in range(1, len(b)-1):
            if not (b[i] == b[i-1] or b[i] == b[i+1]): happy = False
        if happy: print("YES"); return

    # general case
    buckets = [0] * 26
    any_lonely_ladybugs = False
    for i in range(len(b)):
        if b[i] is not '_': buckets[ord(b[i])-65] += 1
    for i in range(26):
        if buckets[i] == 1: any_lonely_ladybugs = True
    all_ladybugs_happy = not any_lonely_ladybugs and underscores > 0
    print("YES" if all_ladybugs_happy else "NO")

for _ in range(games):
    n = int(input().strip())
    b = input().strip()
    solve(b)
