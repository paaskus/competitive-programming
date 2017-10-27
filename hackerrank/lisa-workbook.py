import math

n, k = map(int, input().strip().split())

def solve(A, k):
    count = 0
    page = 1
    for i in range(n):
        first_prob_on_page = 1
        pages_in_chapter = math.ceil(A[i]/k)
        for _ in range(pages_in_chapter):
            count += page >= first_prob_on_page and page < min(A[i]+1, first_prob_on_page + k)
            page += 1
            first_prob_on_page += k
    return count

A = [int(x) for x in input().strip().split()]
print(solve(A, k))
