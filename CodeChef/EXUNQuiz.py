t = int(input())
for _ in range(t):
    n, s = map(int, input().split())
    answer = -1
    for c in range(n + 1):
        w = 4 * c - s
        if w >= 0 and c + w <= n:
            total = c + w           
            if answer == -1 or total < answer:
                answer = total
    print(answer)
  
