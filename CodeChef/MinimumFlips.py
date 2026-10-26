t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    if n % 2 != 0:
        print(-1)
    else:
        ones = a.count(1)
        print(abs(ones - n // 2))
