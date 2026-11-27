t = int(input())
for _ in range(t):
    a, b, x, y = map(int, input().split())
    units_req = a * b
    units_has = x * y
    if units_has >= units_req:
        print("YES")
    else:
        print("NO")
