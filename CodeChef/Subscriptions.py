t = int(input())
for _ in range(t):
    n, x = map(int, input().split())
    subscriptions = (n + 5) // 6
    cost = subscriptions * x
    print(cost)
