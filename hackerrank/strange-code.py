import math

def bruteforce(t):
    counter = 3
    doubler = counter
    for _ in range(1, t):
        counter -= 1
        if counter < 1:
            counter = doubler * 2
            doubler = counter
    return counter

def solve(t):
    doubler = 3
    time = 1
    value = 3
    while time+value <= t:
        time += value
        value += doubler
        doubler *= 2
    value -= t - time
    return value

t = int(input().strip())

print(solve(t))

# f(1) = 3
# f(2) = 2
# f(3) = 1

# f(4) = 6
# f(5) = 5
# f(6) = 4
# f(7) = 3
# f(8) = 2
# f(9) = 1

# f(10) = 12
# f(11) = 11
# f(12) = 10
# f(13) = 9
# f(14) = 8
# f(15) = 7
# f(16) = 6
# f(17) = 5
# f(18) = 4
# f(19) = 3
# f(20) = 2
# f(21) = 1
