import sys

def solve(nums):
    buckets = [0] * 100
    for i in range(len(nums)):
        buckets[nums[i]] += 1
    return max([buckets[i] + buckets[i+1] for i in range(len(nums)-1)])

n = int(input().strip())
nums = [int(n) for n in input().strip().split()]

print(solve(nums))
