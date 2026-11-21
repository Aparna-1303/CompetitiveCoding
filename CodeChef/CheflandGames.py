t = int(input())
for _ in range(t):
    a = list(map(int, input().split()))
    count = 0
    for i in a:
        if i == 0:
            count += 1
        else:
            continue
    if count == 4:
        print("IN")
    else:
        print("OUT")
