t = int(input())
for _ in range(t):
    x, y, z = map(int, input().split())
    half = (x * y) // 2
    if z > half:
        print("YES")
    else:
        print("NO")
