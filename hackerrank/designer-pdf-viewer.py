import sys

def solve(heights, word):
    height = 0
    for letter in word:
        height = max(height, heights[ord(letter)-ord('a')])
    return height * len(word)

heights = list(map(int, input().strip().split()))
word = input().strip()

print(solve(heights, word))
