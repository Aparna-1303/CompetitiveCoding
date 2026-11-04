t = int(input())
for _ in range(t):
    a, b, c = map(int, input().split())
    d = (a + b) / 2
    if d > c:
        print("YES")
    else:
        print("NO")
