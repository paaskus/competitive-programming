n, m = map(int, input().strip().split())
A = [input().strip() for _ in range(n)]

def solve(A):
    max_combined_topics = 0
    count = 0
    for i in range(n):
        for j in range(i+1, n): # iterate through all possible pairs
            combined_topics = 0
            for k in range(m): # iterate through all topics
                # count the number of 1's in the logical OR of this binary pair
                if A[i][k] == '1' or A[j][k] == '1': combined_topics += 1
            if combined_topics > max_combined_topics:
                max_combined_topics = combined_topics
                count = 1
            elif combined_topics == max_combined_topics: count += 1
    print(max_combined_topics); print(count) # print result
solve(A)
