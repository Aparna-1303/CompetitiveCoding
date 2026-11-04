t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    min_row = n
    max_row = -1
    min_col = m
    max_col = -1
    for i in range(n):
        s = input().strip()
        for j in range(m):
            if s[j] == '1':
                min_row = min(min_row, i)
                max_row = max(max_row, i)
                min_col = min(min_col, j)
                max_col = max(max_col, j)
    result = (max_row - min_row + 1) * (max_col - min_col + 1)
    print(result)
