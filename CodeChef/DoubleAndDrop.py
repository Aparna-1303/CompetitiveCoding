t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    total = sum(a)
    mx = max(a)
    answer = total - mx
    for i in range(n):
        new_sum = total + a[i]
        new_max = max(mx, 2 * a[i])
        score = new_sum - new_max
        answer = max(answer, score)
    print(answer)
