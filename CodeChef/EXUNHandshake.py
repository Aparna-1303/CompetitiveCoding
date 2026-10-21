t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    a.sort()
    people = 0
    count = 0
    for i in a:
        people += i
        handshakes = people * (people - 1) // 2
        if handshakes <= m:
            count += 1
        else:
            break
    print(count)
