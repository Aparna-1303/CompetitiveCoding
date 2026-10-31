t = int(input())
for _ in range(t):
    n,x,k = map(int,input().split())
    min_changes = float('inf')
    for y in range(0, n+1, k):
        min_changes = min(min_changes, abs(y-x))
    print(min_changes)
