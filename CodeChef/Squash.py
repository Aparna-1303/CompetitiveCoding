t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    s = input()
    count = 1
    for i in range(1, n):
        if s[i] != s[i - 1]:
            count += 1
    if count <= k <= n:
        print("YES")
    else:
        print("NO")
