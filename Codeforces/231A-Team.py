n = int(input())
solve_count = 0
for i in range(n):
    a = list(map(int, input().split()))
    if(a.count(1) >= 2):
        solve_count += 1
print(solve_count)  
