t = int(input())
for _ in range(t):
    x = int(input())
    if x > 5000:
        print(x - 500)
    elif x > 100 and x <= 1000:
        print(x - 25)
    elif x > 1000 and x <= 5000:
        print(x - 100)
    else:
        print(x)
