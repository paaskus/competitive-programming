#!/usr/bin/env python3
"""
1 -> D1: 1
2 -> D1: p, D2: 11
3 -> D1: p, D2: pp, D3: 111
4 -> D1: p, D2: pp, D3: 1111
5 -> D1: p, D2: pp, D3: pppp, D4: 11111
6 -> D1: p, D2: pp, D3: pppp, D4: 111111
7 -> D1: p, D2: pp, D3: pppp, D4: 1111111
8 -> D1: p, D2: pp, D3: pppp, D4: 11111111
9 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 111111111
10 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 1111111111
11 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 11111111111
12 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 111111111111
13 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 1111111111111
14 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 11111111111111
15 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 111111111111111
16 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: 1111111111111111
17 -> D1: p, D2: pp, D3: pppp, D4: pppppppp, D5: pppppppppppppppp, D6: 11111111111111111
"""

import sys
import math

n = int(input().strip())
print(math.ceil(math.log(n, 2)) + 1)
