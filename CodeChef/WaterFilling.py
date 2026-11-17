t = int(input())
for _ in range(t):
    b = list(map(int, input().split()))
    count_0 = 0
    for i in b:
        if i == 0:
            count_0 += 1
        else:
            continue
    if count_0 >= 2:
        print("Water filling time")
    else:
        print("Not now")
    
