t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    if n <= 2:
        print(0)
    else:
        a.sort()
        result = min(a[-1] - a[1], a[-2] - a[0])
        print(result)
