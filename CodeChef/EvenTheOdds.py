t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    odd = 0
    first = {0 : -1}
    result = 0
    for i in range(n):
        if a[i] % 2 == 1:
            odd += 1
        p = odd % 2
        if p in first:
            result = max(result, i - first[p])
        else:
            first[p] = i
    print(result)
