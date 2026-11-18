t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    total = sum(a)
    minimum = float('inf')
    for i in range(n - 1):
        x = (a[i] + a[i + 1]) // 2
        minimum = min(minimum, x)
    print(total - minimum)
