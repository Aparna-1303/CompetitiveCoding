y = int(input())
while True:
    y += 1
    s = str(y)
    if len(s) == len(set(s)):
        print(y)
        break
