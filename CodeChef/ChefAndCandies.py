t = int(input())
for _ in range(t):
    n, x = map(int, input().split())
    if n > x:
        to_buy = n - x
        if to_buy % 4 == 0:
            print(to_buy // 4)
        else:
            print((to_buy // 4) + 1)
    else:
        print(0)
