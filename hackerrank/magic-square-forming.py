import sys

magic_squares = [
    [[8, 1, 6],
     [3, 5, 7],
     [4, 9, 2]],
    [[6, 1, 8],
     [7, 5, 3],
     [2, 9, 4]],
    [[8, 3, 4],
     [1, 5, 9],
     [6, 7, 2]],
    [[4, 3, 8],
     [9, 5, 1],
     [2, 7, 6]],
    [[6, 7, 2],
     [1, 5, 9],
     [8, 3, 4]],
    [[2, 7, 6],
     [9, 5, 1],
     [4, 3, 8]],
    [[4, 9, 2],
     [3, 5, 7],
     [8, 1, 6]],
    [[2, 9, 4],
     [7, 5, 3],
     [6, 1, 8]]
]

def read_row(): return [int(num) for num in input().strip().split()]

in_square = [read_row(), read_row(), read_row()]

def cost_of_transforming_square(current_square, target_square):
    """
    returns the cost of turning current_square into target_square,
    where the cost to convert any digit, a, to any other digit, b,
    in the range [1, 9] is |a - b|.
    """
    cost = 0
    for i in range(len(current_square)):
        for j in range(len(current_square)):
            cost += abs(current_square[i][j] - target_square[i][j])
    return cost
    
def solve(square):
    min_cost = cost_of_transforming_square(square, magic_squares[0])
    for i in range(1, len(magic_squares)):
        min_cost = min(min_cost, cost_of_transforming_square(square, magic_squares[i]))
    return min_cost

print(solve(in_square))
