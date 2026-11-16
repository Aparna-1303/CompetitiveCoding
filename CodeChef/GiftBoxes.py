t = int(input())
for _ in range(t):
    x, y = map(int, input().split())
    if x * 3 <= y:
        print("YES")
    else:
        print("NO")
