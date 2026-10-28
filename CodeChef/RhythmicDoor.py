t = int(input())
for _ in range(t):
    n = int(input())
    s = input()
    count = 0
    answer = 0
    prev = ''
    for ch in s:
        if ch == prev:
            count += 1
        else:
            count = 1
        if count == 3:
            answer += 1
            count = 0
        prev = ch
    print(answer)
