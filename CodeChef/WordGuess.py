t = int(input())
for _ in range(t):
    s = input()
    r = input()
    m = ""
    for i in range(len(s)):
        if s[i] == r[i]:
            m += 'G'
        else:
            m += 'B'
    print(m)
